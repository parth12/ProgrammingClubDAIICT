// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.message.proguard;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

// Referenced classes of package com.umeng.message.proguard:
//            aD

static final class 
    implements HostnameVerifier
{

    public boolean verify(String s, SSLSession sslsession)
    {
        return true;
    }

    ()
    {
    }
}
