// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.internal.ActivationOverlay;
import com.google.ads.internal.d;
import com.google.ads.internal.h;
import com.google.ads.util.i;

// Referenced classes of package com.google.ads:
//            m, Ad, AdView, InterstitialAd

public class n extends i
{

    public final com.google.ads.util.i.b a;
    public final com.google.ads.util.i.b b;
    public final com.google.ads.util.i.d c;
    public final com.google.ads.util.i.b d;
    public final com.google.ads.util.i.b e;
    public final com.google.ads.util.i.b f;
    public final com.google.ads.util.i.b g;
    public final com.google.ads.util.i.b h;
    public final com.google.ads.util.i.b i;
    public final com.google.ads.util.i.b j;
    public final com.google.ads.util.i.b k;
    public final com.google.ads.util.i.c l = new com.google.ads.util.i.c(this, "currentAd", null);
    public final com.google.ads.util.i.c m = new com.google.ads.util.i.c(this, "nextAd", null);
    public final com.google.ads.util.i.c n = new com.google.ads.util.i.c(this, "adSizes", null);
    public final com.google.ads.util.i.c o = new com.google.ads.util.i.c(this, "adListener");
    public final com.google.ads.util.i.c p = new com.google.ads.util.i.c(this, "appEventListener");
    public final com.google.ads.util.i.c q = new com.google.ads.util.i.c(this, "swipeableEventListener");
    public final com.google.ads.util.i.c r = new com.google.ads.util.i.c(this, "spamSignals", null);
    public final com.google.ads.util.i.c s = new com.google.ads.util.i.c(this, "spamSignalsUtil", null);
    public final com.google.ads.util.i.c t = new com.google.ads.util.i.c(this, "usesManualImpressions", Boolean.valueOf(false));

    public n(m m1, Ad ad, AdView adview, InterstitialAd interstitialad, String s1, Activity activity, Context context, 
            ViewGroup viewgroup, h h1, d d1)
    {
        Object obj = null;
        super();
        d = new com.google.ads.util.i.b(this, "appState", m1);
        a = new com.google.ads.util.i.b(this, "ad", ad);
        j = new com.google.ads.util.i.b(this, "adView", adview);
        g = new com.google.ads.util.i.b(this, "adType", h1);
        h = new com.google.ads.util.i.b(this, "adUnitId", s1);
        c = new com.google.ads.util.i.d(this, "activity", activity);
        k = new com.google.ads.util.i.b(this, "interstitialAd", interstitialad);
        i = new com.google.ads.util.i.b(this, "bannerContainer", viewgroup);
        f = new com.google.ads.util.i.b(this, "applicationContext", context);
        b = new com.google.ads.util.i.b(this, "adManager", d1);
        m1 = obj;
        if (h1 != null)
        {
            m1 = obj;
            if (h1.b())
            {
                m1 = new ActivationOverlay(this);
            }
        }
        e = new com.google.ads.util.i.b(this, "activationOverlay", m1);
    }

    public boolean a()
    {
        return !b();
    }

    public boolean b()
    {
        return ((h)g.a()).a();
    }
}
