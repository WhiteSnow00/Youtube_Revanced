import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hti implements acjb
{
    public final Object a;
    public final Uri b;
    public final int c;
    private final long d;
    
    public hti(final aiht aiht) {
        int r;
        final int n = r = 1;
        if (aiht != null) {
            r = n;
            if ((aiht.b & 0x100) != 0x0) {
                aihs aihs;
                if ((aihs = aiht.j) == null) {
                    aihs = aihs.a;
                }
                r = aefb.R(aihs.b);
                if (r == 0) {
                    r = n;
                }
            }
        }
        this(aiht, r);
    }
    
    public hti(final aiht a, final int c) {
        final long o = a.o;
        this.a = a;
        this.d = o;
        this.c = c;
        this.b = a(a);
    }
    
    public static Uri a(final aiht aiht) {
        final String e = aiht.e;
        final int size = aiht.l.size();
        boolean b = false;
        if (size == 0) {
            if (aiht.m.size() <= 0) {
                b = b;
                if (aiht.n.size() <= 0) {
                    return b(e, b);
                }
            }
            b = true;
        }
        return b(e, b);
    }
    
    public static Uri b(final String s, final boolean b) {
        String s2;
        if (!b) {
            s2 = "channel/list/view";
        }
        else {
            s2 = "channel/list/edit";
        }
        return acjd.g(4, s2, s);
    }
    
    public static void c(final ahaz ahaz) {
        final long o = ((aiht)ahaz.instance).o;
        ahaz.copyOnWrite();
        final aiht aiht = (aiht)ahaz.instance;
        aiht.b |= 0x400;
        aiht.o = o + 1L;
    }
    
    @Override
    public final acjb e(final acjb acjb) {
        if (!(acjb instanceof hti)) {
            return this;
        }
        final hti hti = (hti)acjb;
        if (this.d > hti.d) {
            return this;
        }
        return hti;
    }
}
