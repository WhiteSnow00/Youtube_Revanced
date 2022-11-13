// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.comment.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

public class ImageCarouselEditorAdapter$1 extends ResultReceiver
{
    final sru a;
    final suz b;
    
    public ImageCarouselEditorAdapter$1(final suz b, final sru a) {
        this.b = b;
        this.a = a;
        super((Handler)null);
    }
    
    protected final void onReceiveResult(final int n, final Bundle bundle) {
        this.b.y(this.a);
    }
}
