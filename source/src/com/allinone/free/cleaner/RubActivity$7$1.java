// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.allinone.free.cleaner;

import android.widget.TextView;

// Referenced classes of package com.allinone.free.cleaner:
//            RubActivity

class this._cls1
    implements Runnable
{

    final ss._cls26 this$1;

    public void run()
    {
        if (RubActivity.access$26() < 0.0D)
        {
            RubActivity.access$10(_fld0).setTextSize(50F);
            RubActivity.access$10(_fld0).setText("0");
            return;
        } else
        {
            RubActivity.access$10(_fld0).setTextSize(50F);
            RubActivity.access$10(_fld0).setText((new StringBuilder()).append(RubActivity.access$26()).toString());
            return;
        }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/allinone/free/cleaner/RubActivity$7

/* anonymous class */
    class RubActivity._cls7 extends Thread
    {

        final RubActivity this$0;

        public void run()
        {
            super.run();
            do
            {
                do
                {
                    if (!RubActivity.access$25())
                    {
                        return;
                    }
                    RubActivity.access$7(RubActivity.access$26() - 1.1000000000000001D);
                    RubActivity.access$7(RubActivity.roundDouble(RubActivity.access$26(), 2).doubleValue());
                    RubActivity.access$10(RubActivity.this).post(new RubActivity._cls7._cls1());
                    try
                    {
                        sleep(10L);
                    }
                    catch (InterruptedException interruptedexception)
                    {
                        interruptedexception.printStackTrace();
                    }
                } while (RubActivity.access$26() > 0.0D);
                RubActivity.access$27(false);
            } while (true);
        }


            
            {
                this$0 = RubActivity.this;
                super();
            }
    }

}
