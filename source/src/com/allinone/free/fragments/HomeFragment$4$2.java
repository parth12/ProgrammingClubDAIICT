// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.allinone.free.fragments;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import com.allinone.free.dialog.UpdateDialogVerison2;
import com.allinone.free.model.GameInfosVersionModel;
import com.allinone.free.utils.Myutils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.allinone.free.fragments:
//            HomeFragment

class this._cls1 extends AsyncTask
{

    final onPostExecute this$1;

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        try
        {
            Thread.sleep(20000L);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            avoid.printStackTrace();
        }
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        super.onPostExecute(void1);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/allinone/free/fragments/HomeFragment$4

/* anonymous class */
    class HomeFragment._cls4 extends Handler
    {

        final HomeFragment this$0;

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR lookupswitch 2: default 32
        //                       20: 233
        //                       10000: 38;
               goto _L1 _L2 _L3
_L1:
            super.handleMessage(message);
            return;
_L3:
            try
            {
                if (System.currentTimeMillis() - Myutils.setting_json.getLong("neitui_time") > 0x2932e00L)
                {
                    updateDialogVersion2 = new UpdateDialogVerison2(getActivity(), 0x7f0c0066, itemsOnClick2);
                    updateDialogVersion2.setCanceledOnTouchOutside(false);
                    updateDialogVersion2.show();
                    updateDialogVersion2.setTvTitle(info.getNtTitle());
                    updateDialogVersion2.setTvContent(info.getNtMsg());
                    updateDialogVersion2.setImgIcon(info.getPicPath());
                    Myutils.setting_json.put("neitui_time", System.currentTimeMillis());
                    Myutils.saveSetting();
                }
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
                try
                {
                    Myutils.setting_json.put("neitui_time", System.currentTimeMillis());
                    Myutils.saveSetting();
                }
                catch (JSONException jsonexception1)
                {
                    jsonexception1.printStackTrace();
                }
                (new HomeFragment._cls4._cls1()).execute(new Void[0]);
            }
            continue; /* Loop/switch isn't completed */
_L2:
            if (HomeFragment.access$1(HomeFragment.this))
            {
                (new HomeFragment._cls4._cls2()).execute(new Void[0]);
            }
            if (true) goto _L1; else goto _L4
_L4:
        }


            
            {
                this$0 = HomeFragment.this;
                super();
            }

        // Unreferenced inner class com/allinone/free/fragments/HomeFragment$4$1

/* anonymous class */
        class HomeFragment._cls4._cls1 extends AsyncTask
        {

            final HomeFragment._cls4 this$1;

            protected volatile transient Object doInBackground(Object aobj[])
            {
                return doInBackground((Void[])aobj);
            }

            protected transient Void doInBackground(Void avoid[])
            {
                try
                {
                    Thread.sleep(40000L);
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    avoid.printStackTrace();
                }
                return null;
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((Void)obj);
            }

            protected void onPostExecute(Void void1)
            {
                super.onPostExecute(void1);
                updateDialogVersion2 = new UpdateDialogVerison2(getActivity(), 0x7f0c0066, itemsOnClick2);
                updateDialogVersion2.setCanceledOnTouchOutside(false);
                updateDialogVersion2.show();
                updateDialogVersion2.setTvTitle(info.getNtTitle());
                updateDialogVersion2.setTvContent(info.getNtMsg());
                updateDialogVersion2.setImgIcon(info.getPicPath());
            }

                    
                    {
                        this$1 = HomeFragment._cls4.this;
                        super();
                    }
        }

    }

}
