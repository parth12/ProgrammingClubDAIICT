// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.allinone.free.fragments;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.allinone.free.utils.ImageUtil;
import com.inmobi.monetization.IMErrorCode;
import com.inmobi.monetization.IMNative;
import com.inmobi.monetization.IMNativeListener;
import org.json.JSONObject;

// Referenced classes of package com.allinone.free.fragments:
//            AppFeaturedFragment

class this._cls0
    implements IMNativeListener
{

    private String downloadurl;
    final AppFeaturedFragment this$0;

    public void onNativeRequestFailed(IMErrorCode imerrorcode)
    {
        try
        {
            AppFeaturedFragment.access$4(AppFeaturedFragment.this).setVisibility(8);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IMErrorCode imerrorcode)
        {
            return;
        }
    }

    public void onNativeRequestSucceeded(IMNative imnative)
    {
        try
        {
            AppFeaturedFragment.access$4(AppFeaturedFragment.this).setVisibility(0);
        }
        catch (Exception exception) { }
        AppFeaturedFragment.access$5(AppFeaturedFragment.this, imnative);
        if (imnative != null)
        {
            imnative.attachToView(AppFeaturedFragment.access$4(AppFeaturedFragment.this));
        }
        imnative = imnative.getContent();
        try
        {
            imnative = new JSONObject(imnative);
            String s = imnative.getString("screenshots");
            downloadurl = imnative.getString("landingURL");
            imnative = (new JSONObject(s)).getString("url");
            if (!imnative.equals(""))
            {
                String s1 = ImageUtil.getCacheImgPath().concat(ImageUtil.md5(imnative));
                AppFeaturedFragment.access$11(AppFeaturedFragment.this, ImageUtil.loadImage(s1, imnative, new com.allinone.free.utils.ImageUtil.ImageCallback() {

                    final AppFeaturedFragment._cls4 this$1;

                    public void loadImage(Bitmap bitmap, String s2)
                    {
                        if (AppFeaturedFragment.access$6(this$0) != null)
                        {
                            AppFeaturedFragment.access$7(this$0, bitmap.getWidth());
                            AppFeaturedFragment.access$8(this$0, bitmap.getHeight());
                            s2 = new android.widget.LinearLayout.LayoutParams(-1, getHeight(AppFeaturedFragment.access$9(this$0), AppFeaturedFragment.access$10(this$0)));
                            AppFeaturedFragment.access$6(this$0).setLayoutParams(s2);
                            AppFeaturedFragment.access$6(this$0).setImageBitmap(bitmap);
                        }
                    }

            
            {
                this$1 = AppFeaturedFragment._cls4.this;
                super();
            }
                }, 0));
                if (AppFeaturedFragment.access$12(AppFeaturedFragment.this) != null)
                {
                    AppFeaturedFragment.access$7(AppFeaturedFragment.this, AppFeaturedFragment.access$12(AppFeaturedFragment.this).getWidth());
                    AppFeaturedFragment.access$8(AppFeaturedFragment.this, AppFeaturedFragment.access$12(AppFeaturedFragment.this).getHeight());
                    imnative = new android.widget.ams(-1, getHeight(AppFeaturedFragment.access$9(AppFeaturedFragment.this), AppFeaturedFragment.access$10(AppFeaturedFragment.this)));
                    AppFeaturedFragment.access$6(AppFeaturedFragment.this).setLayoutParams(imnative);
                    AppFeaturedFragment.access$6(AppFeaturedFragment.this).setImageBitmap(AppFeaturedFragment.access$12(AppFeaturedFragment.this));
                }
            }
            AppFeaturedFragment.access$6(AppFeaturedFragment.this).setOnClickListener(new android.view.View.OnClickListener() {

                final AppFeaturedFragment._cls4 this$1;

                public void onClick(View view)
                {
                    view = new Intent("android.intent.action.VIEW", Uri.parse(downloadurl));
                    startActivity(view);
                    if (AppFeaturedFragment.access$13(this$0) != null)
                    {
                        AppFeaturedFragment.access$13(this$0).handleClick(null);
                    }
                }

            
            {
                this$1 = AppFeaturedFragment._cls4.this;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IMNative imnative)
        {
            imnative.printStackTrace();
        }
    }



    _cls2.this._cls1()
    {
        this$0 = AppFeaturedFragment.this;
        super();
    }
}
