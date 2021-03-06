// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.google.ads.doubleclick.DfpExtras;
import com.google.ads.mediation.NetworkExtras;
import com.google.ads.mediation.admob.AdMobAdapterExtras;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AdRequest
{
    public static final class ErrorCode extends Enum
    {

        public static final ErrorCode INTERNAL_ERROR;
        public static final ErrorCode INVALID_REQUEST;
        public static final ErrorCode NETWORK_ERROR;
        public static final ErrorCode NO_FILL;
        private static final ErrorCode b[];
        private final String a;

        public static ErrorCode valueOf(String s)
        {
            return (ErrorCode)Enum.valueOf(com/google/ads/AdRequest$ErrorCode, s);
        }

        public static ErrorCode[] values()
        {
            return (ErrorCode[])b.clone();
        }

        public String toString()
        {
            return a;
        }

        static 
        {
            INVALID_REQUEST = new ErrorCode("INVALID_REQUEST", 0, "Invalid Ad request.");
            NO_FILL = new ErrorCode("NO_FILL", 1, "Ad request successful, but no ad returned due to lack of ad inventory.");
            NETWORK_ERROR = new ErrorCode("NETWORK_ERROR", 2, "A network error occurred.");
            INTERNAL_ERROR = new ErrorCode("INTERNAL_ERROR", 3, "There was an internal error.");
            b = (new ErrorCode[] {
                INVALID_REQUEST, NO_FILL, NETWORK_ERROR, INTERNAL_ERROR
            });
        }

        private ErrorCode(String s, int i1, String s1)
        {
            super(s, i1);
            a = s1;
        }
    }

    public static final class Gender extends Enum
    {

        public static final Gender FEMALE;
        public static final Gender MALE;
        public static final Gender UNKNOWN;
        private static final Gender a[];

        public static Gender valueOf(String s)
        {
            return (Gender)Enum.valueOf(com/google/ads/AdRequest$Gender, s);
        }

        public static Gender[] values()
        {
            return (Gender[])a.clone();
        }

        static 
        {
            UNKNOWN = new Gender("UNKNOWN", 0);
            MALE = new Gender("MALE", 1);
            FEMALE = new Gender("FEMALE", 2);
            a = (new Gender[] {
                UNKNOWN, MALE, FEMALE
            });
        }

        private Gender(String s, int i1)
        {
            super(s, i1);
        }
    }


    public static final String LOGTAG = "Ads";
    public static final String TEST_EMULATOR;
    public static final String VERSION = "6.4.1";
    private static final SimpleDateFormat a;
    private static Method b;
    private static Method c;
    private Gender d;
    private Date e;
    private Set f;
    private Map g;
    private final Map h = new HashMap();
    private Location i;
    private boolean j;
    private boolean k;
    private Set l;

    public AdRequest()
    {
        d = null;
        e = null;
        f = null;
        g = null;
        i = null;
        j = false;
        k = false;
        l = null;
    }

    private AdMobAdapterExtras a()
    {
        this;
        JVM INSTR monitorenter ;
        AdMobAdapterExtras admobadapterextras;
        if (getNetworkExtras(com/google/ads/mediation/admob/AdMobAdapterExtras) == null)
        {
            setNetworkExtras(new AdMobAdapterExtras());
        }
        admobadapterextras = (AdMobAdapterExtras)getNetworkExtras(com/google/ads/mediation/admob/AdMobAdapterExtras);
        this;
        JVM INSTR monitorexit ;
        return admobadapterextras;
        Exception exception;
        exception;
        throw exception;
    }

    public AdRequest addExtra(String s, Object obj)
    {
        AdMobAdapterExtras admobadapterextras = a();
        if (admobadapterextras.getExtras() == null)
        {
            admobadapterextras.setExtras(new HashMap());
        }
        admobadapterextras.getExtras().put(s, obj);
        return this;
    }

    public AdRequest addKeyword(String s)
    {
        if (f == null)
        {
            f = new HashSet();
        }
        f.add(s);
        return this;
    }

    public AdRequest addKeywords(Set set)
    {
        if (f == null)
        {
            f = new HashSet();
        }
        f.addAll(set);
        return this;
    }

    public AdRequest addMediationExtra(String s, Object obj)
    {
        if (g == null)
        {
            g = new HashMap();
        }
        g.put(s, obj);
        return this;
    }

    public AdRequest addTestDevice(String s)
    {
        if (l == null)
        {
            l = new HashSet();
        }
        l.add(s);
        return this;
    }

    public AdRequest clearBirthday()
    {
        e = null;
        return this;
    }

    public Date getBirthday()
    {
        return e;
    }

    public Gender getGender()
    {
        return d;
    }

    public Set getKeywords()
    {
        if (f == null)
        {
            return null;
        } else
        {
            return Collections.unmodifiableSet(f);
        }
    }

    public Location getLocation()
    {
        return i;
    }

    public Object getNetworkExtras(Class class1)
    {
        return h.get(class1);
    }

    public boolean getPlusOneOptOut()
    {
        return a().getPlusOneOptOut();
    }

    public Map getRequestMap(Context context)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        if (f != null)
        {
            hashmap.put("kw", f);
        }
        if (d != null)
        {
            hashmap.put("cust_gender", Integer.valueOf(d.ordinal()));
        }
        if (e != null)
        {
            hashmap.put("cust_age", a.format(e));
        }
        if (i != null)
        {
            hashmap.put("uule", AdUtil.a(i));
        }
        if (j)
        {
            hashmap.put("testing", Integer.valueOf(1));
        }
        if (!isTestDevice(context)) goto _L2; else goto _L1
_L1:
        hashmap.put("adtest", "on");
_L8:
        DfpExtras dfpextras;
        context = (AdMobAdapterExtras)getNetworkExtras(com/google/ads/mediation/admob/AdMobAdapterExtras);
        dfpextras = (DfpExtras)getNetworkExtras(com/google/ads/doubleclick/DfpExtras);
        if (dfpextras == null || dfpextras.getExtras() == null || dfpextras.getExtras().isEmpty()) goto _L4; else goto _L3
_L3:
        hashmap.put("extras", dfpextras.getExtras());
_L6:
        if (dfpextras != null)
        {
            context = dfpextras.getPublisherProvidedId();
            if (!TextUtils.isEmpty(context))
            {
                hashmap.put("ppid", context);
            }
        }
        if (g != null)
        {
            hashmap.put("mediation_extras", g);
        }
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        context = ((Context) (b.invoke(null, new Object[0])));
        context = (Map)c.invoke(context, new Object[0]);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        if (context.size() > 0)
        {
            hashmap.put("analytics_join_id", context);
        }
        return hashmap;
_L2:
        if (!k)
        {
            if (AdUtil.c())
            {
                context = "AdRequest.TEST_EMULATOR";
            } else
            {
                context = (new StringBuilder()).append("\"").append(AdUtil.a(context)).append("\"").toString();
            }
            com.google.ads.util.b.c((new StringBuilder()).append("To get test ads on this device, call adRequest.addTestDevice(").append(context).append(");").toString());
            k = true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (context != null && context.getExtras() != null && !context.getExtras().isEmpty())
        {
            hashmap.put("extras", context.getExtras());
        }
        if (true) goto _L6; else goto _L5
_L5:
        context;
        com.google.ads.util.b.c("Internal Analytics Error:", context);
        return hashmap;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean isTestDevice(Context context)
    {
        if (l != null)
        {
            context = AdUtil.a(context);
            break MISSING_BLOCK_LABEL_12;
        }
        do
        {
            return false;
        } while (context == null || !l.contains(context));
        return true;
    }

    public AdRequest removeNetworkExtras(Class class1)
    {
        h.remove(class1);
        return this;
    }

    public AdRequest setBirthday(String s)
    {
        if (s == "" || s == null)
        {
            e = null;
            return this;
        }
        try
        {
            e = a.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.ads.util.b.e("Birthday format invalid.  Expected 'YYYYMMDD' where 'YYYY' is a 4 digit year, 'MM' is a two digit month, and 'DD' is a two digit day.  Birthday value ignored");
            e = null;
            return this;
        }
        return this;
    }

    public AdRequest setBirthday(Calendar calendar)
    {
        if (calendar == null)
        {
            e = null;
            return this;
        } else
        {
            setBirthday(calendar.getTime());
            return this;
        }
    }

    public AdRequest setBirthday(Date date)
    {
        if (date == null)
        {
            e = null;
            return this;
        } else
        {
            e = new Date(date.getTime());
            return this;
        }
    }

    public AdRequest setExtras(Map map)
    {
        a().setExtras(map);
        return this;
    }

    public AdRequest setGender(Gender gender)
    {
        d = gender;
        return this;
    }

    public AdRequest setKeywords(Set set)
    {
        f = set;
        return this;
    }

    public AdRequest setLocation(Location location)
    {
        i = location;
        return this;
    }

    public AdRequest setMediationExtras(Map map)
    {
        g = map;
        return this;
    }

    public AdRequest setNetworkExtras(NetworkExtras networkextras)
    {
        if (networkextras != null)
        {
            h.put(networkextras.getClass(), networkextras);
        }
        return this;
    }

    public AdRequest setPlusOneOptOut(boolean flag)
    {
        a().setPlusOneOptOut(flag);
        return this;
    }

    public AdRequest setTestDevices(Set set)
    {
        l = set;
        return this;
    }

    public AdRequest setTesting(boolean flag)
    {
        j = flag;
        return this;
    }

    static 
    {
        a = new SimpleDateFormat("yyyyMMdd");
        b = null;
        c = null;
        Method amethod[];
        int j1;
        amethod = Class.forName("com.google.analytics.tracking.android.AdMobInfo").getMethods();
        j1 = amethod.length;
        int i1 = 0;
_L8:
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        Method method = amethod[i1];
        if (!method.getName().equals("getInstance") || method.getParameterTypes().length != 0) goto _L4; else goto _L3
_L3:
        b = method;
          goto _L5
_L4:
        if (method.getName().equals("getJoinIds") && method.getParameterTypes().length == 0)
        {
            c = method;
        }
          goto _L5
        Object obj;
        obj;
        com.google.ads.util.b.a("No Google Analytics: Library Not Found.");
_L6:
        TEST_EMULATOR = AdUtil.b("emulator");
        return;
_L2:
        if (b == null || c == null)
        {
            b = null;
            c = null;
            com.google.ads.util.b.e("No Google Analytics: Library Incompatible.");
        }
        continue; /* Loop/switch isn't completed */
        obj;
        com.google.ads.util.b.a("No Google Analytics: Error Loading Library");
        if (true) goto _L6; else goto _L5
_L5:
        i1++;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
