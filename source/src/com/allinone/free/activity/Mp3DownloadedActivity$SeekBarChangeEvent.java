// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.allinone.free.activity;

import android.media.MediaPlayer;
import android.widget.SeekBar;
import com.allinone.free.utils.Player;

// Referenced classes of package com.allinone.free.activity:
//            Mp3DownloadedActivity

class this._cls0
    implements android.widget.ChangeEvent
{

    int progress;
    final Mp3DownloadedActivity this$0;

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        progress = (Mp3DownloadedActivity.access$3(Mp3DownloadedActivity.this).mediaPlayer.getDuration() * i) / seekbar.getMax();
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        Mp3DownloadedActivity.access$3(Mp3DownloadedActivity.this).mediaPlayer.seekTo(progress);
    }

    I()
    {
        this$0 = Mp3DownloadedActivity.this;
        super();
    }
}
