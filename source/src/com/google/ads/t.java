// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            o

public class t
    implements o
{

    public t()
    {
    }

    public void a(d d, HashMap hashmap, WebView webview)
    {
        if (webview instanceof AdWebView)
        {
            ((AdWebView)webview).setCustomClose("1".equals(hashmap.get("custom_close")));
            return;
        } else
        {
            b.b("Trying to set a custom close icon on a WebView that isn't an AdWebView");
            return;
        }
    }
}
