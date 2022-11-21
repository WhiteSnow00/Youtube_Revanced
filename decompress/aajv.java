// 
// Decompiled by Procyon v0.6.0
// 

public class aajv implements aakn
{
    private final aaed a;
    private final aaks b;
    private final aadl c;
    
    public aajv(final aaed a, final aadl c, final aaks b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    protected amwo a(final String s, final amze amze, final String s2, final byte[] array) {
        return amwo.b;
    }
    
    @Override
    public int b(final String s, final amze amze, final String s2, final aacw aacw, final byte[] array, int n) {
        if (this.b.o() && n != 0) {
            n = this.d(s, amze, s2, array, n);
        }
        else {
            n = this.c.a().l().a(s, amze, aacw, array, -1);
        }
        return n;
    }
    
    @Override
    public final void c(final String s, final int n) {
        if (this.b.o() && n != 0) {
            try {
                final aaed a = this.a;
                final ahcr builder = ((ahcz)amwq.a).createBuilder();
                builder.copyOnWrite();
                final amwq amwq = (amwq)builder.instance;
                amwq.c = 2;
                amwq.b |= 0x1;
                final String h = vht.h(n, s);
                builder.copyOnWrite();
                final amwq amwq2 = (amwq)builder.instance;
                h.getClass();
                amwq2.b |= 0x2;
                amwq2.d = h;
                a.a((amwq)builder.build());
                return;
            }
            catch (final aaee aaee) {
                tut.f("[Offline]", "Couldn't delete video through orchestration: ".concat(String.valueOf(s)), (Throwable)aaee);
                return;
            }
        }
        this.c.a().l().w(s);
    }
    
    protected final int d(final String s, final amze amze, final String s2, final byte[] array, int n) {
        final int n2 = 2;
        try {
            final aaed a = this.a;
            final ahcr builder = ((ahcz)amwq.a).createBuilder();
            builder.copyOnWrite();
            final amwq amwq = (amwq)builder.instance;
            amwq.c = 1;
            amwq.b |= 0x1;
            final String h = vht.h(n, s);
            builder.copyOnWrite();
            final amwq amwq2 = (amwq)builder.instance;
            h.getClass();
            amwq2.b |= 0x2;
            amwq2.d = h;
            final amwo a2 = this.a(s, amze, s2, array);
            builder.copyOnWrite();
            final amwq amwq3 = (amwq)builder.instance;
            a2.getClass();
            amwq3.e = a2;
            amwq3.b |= 0x4;
            a.a((amwq)builder.build());
            n = 0;
        }
        catch (final aaee aaee) {
            tut.f("[Offline]", "Couldn't add video through orchestration: ".concat(String.valueOf(s)), (Throwable)aaee);
            n = n2;
        }
        return n;
    }
    
    @Override
    public final int e(final String s, final amze amze, final boolean b, final int n) {
        if (!b && this.b.o() && n != 0) {
            try {
                final aaed a = this.a;
                final ahcr builder = ((ahcz)amwq.a).createBuilder();
                builder.copyOnWrite();
                final amwq amwq = (amwq)builder.instance;
                amwq.c = 1;
                amwq.b |= 0x1;
                final String h = vht.h(n, s);
                builder.copyOnWrite();
                final amwq amwq2 = (amwq)builder.instance;
                h.getClass();
                amwq2.b |= 0x2;
                amwq2.d = h;
                final amwo a2 = this.a(s, amze, null, vby.b);
                builder.copyOnWrite();
                final amwq amwq3 = (amwq)builder.instance;
                a2.getClass();
                amwq3.e = a2;
                amwq3.b |= 0x4;
                a.a((amwq)builder.build());
                return 0;
            }
            catch (final aaee aaee) {
                tut.f("[Offline]", "Couldn't retry video through orchestration: ".concat(String.valueOf(s)), (Throwable)aaee);
                return 2;
            }
        }
        return this.c.a().l().b(s);
    }
}
