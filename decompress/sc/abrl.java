import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abrl implements mvu
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public abrl(final abrm a, final zme b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abrl(final abyh b, final andx a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abrl(final adlp b, final String a, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void a(final String b) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                final Object b2 = this.b;
                final Object a = this.a;
                synchronized (b2) {
                    if (((abyh)b2).b == 2) {
                        ((abyh)b2).a = aezp.k((Object)abyh.k(((andx)a).c, b));
                        ((abyh)b2).b = 3;
                    }
                    return;
                }
            }
            final Object b3 = this.b;
            final Object a2 = this.a;
            final adlp adlp = (adlp)b3;
            final zme c2 = ((zmf)adlp.g).c();
            final vnn vnn = new vnn(((adfu)adlp.c).c, c2, ((zly)adlp.d).j(), c2.g(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            vnn.a = (String)a2;
            vnn.b = b;
            teu.k(((adfu)adlp.c).d.b((vls)vnn, (Executor)adlp.f), (Executor)afum.a, (tes)new twr(adlp, 11, (byte[])null, (byte[])null, (byte[])null), (tet)new tws(adlp, 11, (byte[])null, (byte[])null, (byte[])null));
            return;
        }
        ((abrm)this.a).d(b, (zme)this.b);
    }
}
