// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.area;

import java.util.function.Consumer;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ConsumerAdapter$Subscription;

@atlr(b = "androidx.window.area.WindowAreaControllerImpl$rearDisplayStatus$1", c = "WindowAreaControllerImpl.kt", d = "invokeSuspend", e = { 78, 79 })
final class WindowAreaControllerImpl$rearDisplayStatus$1 extends atlv implements atmp
{
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowAreaControllerImpl this$0;
    
    public WindowAreaControllerImpl$rearDisplayStatus$1(final WindowAreaControllerImpl this$0, final atld atld) {
        this.this$0 = this$0;
        super(2, atld);
    }
    
    private static final void invokeSuspend$lambda$0(final WindowAreaControllerImpl windowAreaControllerImpl, final atsn atsn, final Integer n) {
        final WindowAreaStatus$Companion companion = WindowAreaStatus.Companion;
        n.getClass();
        WindowAreaControllerImpl.access$setCurrentStatus$p(windowAreaControllerImpl, companion.translate$window_release(n));
        WindowAreaStatus windowAreaStatus;
        if ((windowAreaStatus = WindowAreaControllerImpl.access$getCurrentStatus$p(windowAreaControllerImpl)) == null) {
            windowAreaStatus = WindowAreaStatus.UNSUPPORTED;
        }
        atsn.m(windowAreaStatus);
    }
    
    public final atld create(final Object l$0, final atld atld) {
        final WindowAreaControllerImpl$rearDisplayStatus$1 windowAreaControllerImpl$rearDisplayStatus$1 = new WindowAreaControllerImpl$rearDisplayStatus$1(this.this$0, atld);
        windowAreaControllerImpl$rearDisplayStatus$1.L$0 = l$0;
        return (atld)windowAreaControllerImpl$rearDisplayStatus$1;
    }
    
    public final Object invoke(final attn attn, atld create) {
        create = ((atln)this).create(attn, create);
        return ((WindowAreaControllerImpl$rearDisplayStatus$1)create).invokeSuspend(atjv.a);
    }
    
    public final Object invokeSuspend(Object emit) {
        Object a = atlk.a;
        final int label = this.label;
        Object l$1 = null;
        final ClassLoader l$3;
        Label_0433: {
            Label_0423: {
                while (true) {
                    Label_0065: {
                        if (label != 0) {
                            if (label == 1) {
                                final auma auma = (auma)this.L$2;
                                final ConsumerAdapter$Subscription consumerAdapter$Subscription = (ConsumerAdapter$Subscription)this.L$1;
                                final attn attn = (attn)this.L$0;
                                arxj.h(emit);
                                l$1 = consumerAdapter$Subscription;
                                final Object o = auma;
                                final Object o2 = this;
                                final Object l$2 = a;
                                a = attn;
                                break Label_0423;
                            }
                            if (label != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        else {
                            arxj.h(emit);
                            final Object l$2 = this.L$0;
                            Object o = aqqn.v(10, 2);
                            final WindowAreaControllerImpl$rearDisplayStatus$1$$ExternalSyntheticLambda0 windowAreaControllerImpl$rearDisplayStatus$1$$ExternalSyntheticLambda0 = new WindowAreaControllerImpl$rearDisplayStatus$1$$ExternalSyntheticLambda0(this.this$0, (atsn)o);
                            l$1 = WindowAreaControllerImpl.class.getClassLoader();
                            if (l$1 == null) {
                                ((attd)o).m(WindowAreaStatus.UNSUPPORTED);
                                break Label_0423;
                            }
                            l$1 = new ConsumerAdapter((ClassLoader)l$1).createSubscriptionNoActivity(WindowAreaControllerImpl.access$getWindowAreaComponent$p(this.this$0), atno.b((Class)Integer.TYPE), "addRearDisplayStatusListener", "removeRearDisplayStatusListener", (atml)new WindowAreaControllerImpl$rearDisplayStatus$1$subscription$1(windowAreaControllerImpl$rearDisplayStatus$1$$ExternalSyntheticLambda0));
                            o = ((atsz)o).k();
                            break Label_0065;
                        }
                        Object o2 = this.L$2;
                        Object o = this.L$1;
                        final Object l$2 = this.L$0;
                        l$1 = o;
                        try {
                            arxj.h(emit);
                            o = o2;
                            o2 = this;
                            break Label_0254;
                        }
                        finally {
                            break Label_0433;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    Object o2 = null;
                    Object l$2 = null;
                    ((WindowAreaControllerImpl$rearDisplayStatus$1)o2).L$0 = l$2;
                    ((WindowAreaControllerImpl$rearDisplayStatus$1)o2).L$1 = l$3;
                    Object o = null;
                    ((WindowAreaControllerImpl$rearDisplayStatus$1)o2).L$2 = o;
                    ((WindowAreaControllerImpl$rearDisplayStatus$1)o2).label = 1;
                    final Object g = ((auma)o).G((atld)o2);
                    if (g == a) {
                        return a;
                    }
                    final Object o3 = g;
                    final attn attn2 = (attn)l$2;
                    final ClassLoader classLoader = l$3;
                    final attn attn3 = (attn)a;
                    emit = o3;
                    a = attn2;
                    l$1 = classLoader;
                    l$2 = attn3;
                    try {
                        if (!(boolean)emit) {
                            ((ConsumerAdapter$Subscription)l$1).dispose();
                            return atjv.a;
                        }
                        final WindowAreaStatus windowAreaStatus = (WindowAreaStatus)((auma)o).H();
                        ((WindowAreaControllerImpl$rearDisplayStatus$1)o2).L$0 = a;
                        ((WindowAreaControllerImpl$rearDisplayStatus$1)o2).L$1 = l$1;
                        ((WindowAreaControllerImpl$rearDisplayStatus$1)o2).L$2 = o;
                        ((WindowAreaControllerImpl$rearDisplayStatus$1)o2).label = 2;
                        emit = ((attn)a).emit(windowAreaStatus, (atld)o2);
                        if (emit != l$2) {
                            emit = l$2;
                            l$2 = a;
                            a = emit;
                            emit = l$1;
                            continue;
                        }
                        return l$2;
                    }
                    finally {
                        break Label_0433;
                    }
                    break;
                }
            }
            return a;
        }
        ((ConsumerAdapter$Subscription)l$1).dispose();
        throw l$3;
    }
}
