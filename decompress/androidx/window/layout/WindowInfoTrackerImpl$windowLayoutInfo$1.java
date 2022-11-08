// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

import java.util.concurrent.Executor;
import android.content.Context;

@atlr(b = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", c = "WindowInfoTrackerImpl.kt", d = "invokeSuspend", e = { 48 })
final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends atlv implements atmp
{
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInfoTrackerImpl this$0;
    
    public WindowInfoTrackerImpl$windowLayoutInfo$1(final WindowInfoTrackerImpl this$0, final Context $context, final atld atld) {
        this.this$0 = this$0;
        this.$context = $context;
        super(2, atld);
    }
    
    private static final void invokeSuspend$lambda$0(final atsx atsx, final WindowLayoutInfo windowLayoutInfo) {
        atsx.m((Object)windowLayoutInfo);
    }
    
    public final atld create(final Object l$0, final atld atld) {
        final WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$context, atld);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = l$0;
        return (atld)windowInfoTrackerImpl$windowLayoutInfo$1;
    }
    
    public final Object invoke(final atsx atsx, atld create) {
        create = ((atln)this).create(atsx, create);
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1)create).invokeSuspend(atjv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final atlk a = atlk.a;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arxj.h(o);
        }
        else {
            arxj.h(o);
            final atsx atsx = (atsx)this.L$0;
            final WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda0 windowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda0 = new WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda0(atsx);
            WindowInfoTrackerImpl.access$getWindowBackend$p(this.this$0).registerLayoutChangeCallback(this.$context, (Executor)WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda1.INSTANCE, (akn)windowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda0);
            final WindowInfoTrackerImpl$windowLayoutInfo$1$2 windowInfoTrackerImpl$windowLayoutInfo$1$2 = new WindowInfoTrackerImpl$windowLayoutInfo$1$2(this.this$0, (akn)windowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda0);
            this.label = 1;
            if (aqzg.C(atsx, (atma)windowInfoTrackerImpl$windowLayoutInfo$1$2, (atld)this) == a) {
                return a;
            }
        }
        return atjv.a;
    }
}
