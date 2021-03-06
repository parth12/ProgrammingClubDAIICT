// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.app.Activity;
import com.google.ads.internal.h;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.ads.util.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.ads:
//            h, AdRequest, k, j, 
//            g

class i
    implements Runnable
{
    private static class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }


    private final com.google.ads.h a;
    private final String b;
    private final AdRequest c;
    private final HashMap d;
    private final boolean e;
    private final WeakReference f;

    public i(com.google.ads.h h1, Activity activity, String s, AdRequest adrequest, HashMap hashmap)
    {
        a = h1;
        b = s;
        f = new WeakReference(activity);
        c = adrequest;
        d = new HashMap(hashmap);
        e = a(d);
    }

    private void a(MediationAdapter mediationadapter)
        throws com.google.ads.mediation.MediationServerParameters.MappingException, a, IllegalAccessException, InstantiationException
    {
        Activity activity = (Activity)f.get();
        if (activity == null)
        {
            throw new a("Activity became null while trying to instantiate adapter.");
        }
        a.a(mediationadapter);
        Object obj = mediationadapter.getServerParametersType();
        Object obj1;
        MediationAdRequest mediationadrequest;
        if (obj != null)
        {
            obj = (MediationServerParameters)((Class) (obj)).newInstance();
            ((MediationServerParameters) (obj)).load(d);
        } else
        {
            obj = null;
        }
        obj1 = mediationadapter.getAdditionalParametersType();
        if (obj1 != null)
        {
            obj1 = (NetworkExtras)c.getNetworkExtras(((Class) (obj1)));
        } else
        {
            obj1 = null;
        }
        mediationadrequest = new MediationAdRequest(c, activity, e);
        if (a.a.a())
        {
            if (!(mediationadapter instanceof MediationInterstitialAdapter))
            {
                throw new a((new StringBuilder()).append("Adapter ").append(b).append(" doesn't support the MediationInterstitialAdapter").append(" interface.").toString());
            }
            ((MediationInterstitialAdapter)mediationadapter).requestInterstitialAd(new k(a), activity, ((MediationServerParameters) (obj)), mediationadrequest, ((NetworkExtras) (obj1)));
        } else
        {
            if (!(mediationadapter instanceof MediationBannerAdapter))
            {
                throw new a((new StringBuilder()).append("Adapter ").append(b).append(" doesn't support the MediationBannerAdapter interface").toString());
            }
            ((MediationBannerAdapter)mediationadapter).requestBannerAd(new j(a), activity, ((MediationServerParameters) (obj)), a.a.c(), mediationadrequest, ((NetworkExtras) (obj1)));
        }
        a.k();
    }

    private void a(String s, Throwable throwable, g.a a1)
    {
        com.google.ads.util.b.b(s, throwable);
        a.a(false, a1);
    }

    private static boolean a(Map map)
    {
        map = (String)map.remove("gwhirl_share_location");
        if ("1".equals(map))
        {
            return true;
        }
        if (map != null && !"0".equals(map))
        {
            com.google.ads.util.b.b((new StringBuilder()).append("Received an illegal value, '").append(map).append("', for the special share location parameter from mediation server").append(" (expected '0' or '1'). Will not share the location.").toString());
        }
        return false;
    }

    public void run()
    {
        try
        {
            com.google.ads.util.b.a((new StringBuilder()).append("Trying to instantiate: ").append(b).toString());
            a((MediationAdapter)g.a(b, com/google/ads/mediation/MediationAdapter));
            return;
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            a((new StringBuilder()).append("Cannot find adapter class '").append(b).append("'. Did you link the ad network's mediation adapter? Skipping ad network.").toString(), classnotfoundexception, g.a.e);
            return;
        }
        catch (Throwable throwable)
        {
            a("Error while creating adapter and loading ad from ad network. Skipping ad network.", throwable, g.a.f);
        }
    }
}
