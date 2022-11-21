import j$.util.function.Consumer$_CC;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adbq implements Consumer
{
    public final boolean a;
    public final Object b;
    private final int c;
    
    public adbq(final adbo b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adbq(final tnz b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void accept(final Object o) {
        if (this.c != 0) {
            final Object b = this.b;
            final boolean a = this.a;
            final jni jni = (jni)o;
            final int ay = VoiceSearchActivity.ay;
            ahfq ahfq;
            if ((ahfq = jni.d) == null) {
                ahfq = ahfq.a;
            }
            ((tnz)b).b((afax)new fmw(a, ahfq, 4));
            return;
        }
        ((adbo)this.b).a((String)o, this.a);
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        if (this.c != 0) {
            return Consumer$_CC.$default$andThen((Consumer)this, consumer);
        }
        return Consumer$_CC.$default$andThen((Consumer)this, consumer);
    }
}
