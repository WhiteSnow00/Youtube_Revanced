import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import android.net.Uri;
import android.app.Activity;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abkt implements aezf
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final int e;
    
    public abkt(final abku a, final String b, final Function c, final abjt d, final int e) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public abkt(final acau c, final Activity d, final Uri a, final acap b, final int e) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public final Object apply(final Object o) {
        final int e = this.e;
        if (e == 0) {
            final Object a = this.a;
            final Object b = this.b;
            final Object c = this.c;
            final Object d = this.d;
            final ablo ablo = (ablo)o;
            final abku abku = (abku)a;
            ListenableFuture listenableFuture;
            if (abku.d.h() && b != null) {
                listenableFuture = (ListenableFuture)abku.b.a((String)b, (afaq)((Function<ablo, afaq>)c).apply(ablo), aezp.j((Object)((abjt)d).b));
            }
            else {
                listenableFuture = (ListenableFuture)((Function<ablo, afaq>)c).apply(ablo).a();
            }
            return listenableFuture;
        }
        boolean b2 = true;
        if (e != 1) {
            final Object c2 = this.c;
            final Object d2 = this.d;
            final Object a2 = this.a;
            final Object b3 = this.b;
            final aglu aglu = (aglu)o;
            if (aglu != null) {
                final acau acau = (acau)c2;
                final ahqv m = acau.m(acau.c);
                obv obv;
                if (m != null && m.r && acau.a != null) {
                    obv = aglu.p();
                }
                else {
                    obv = aglu.o();
                }
                if (obv != null) {
                    if (TextUtils.equals((CharSequence)obv.b.b, (CharSequence)acau.b)) {
                        obv.b(Uri.parse("https://www.youtube.com"));
                        obv.c((lk)new acat((acap)b3));
                        final cdo d3 = obv.d();
                        final Uri uri = (Uri)a2;
                        final kg n = acau.n(d3, (Activity)d2, uri, false, false);
                        ((acap)b3).qo(acau.l(21));
                        n.B((Context)d2, uri);
                        return b2;
                    }
                }
            }
            b2 = false;
            return b2;
        }
        final Object a3 = this.a;
        final Object b4 = this.b;
        final Object c3 = this.c;
        final Object d4 = this.d;
        final ablo ablo2 = (ablo)o;
        final abku abku2 = (abku)a3;
        ListenableFuture listenableFuture2;
        if (abku2.d.h() && b4 != null) {
            listenableFuture2 = (ListenableFuture)abku2.b.a((String)b4, (afaq)((Function<ablo, afaq>)c3).apply(ablo2), aezp.j((Object)((abjt)d4).b));
        }
        else {
            listenableFuture2 = (ListenableFuture)((Function<ablo, afaq>)c3).apply(ablo2).a();
        }
        return listenableFuture2;
    }
}
