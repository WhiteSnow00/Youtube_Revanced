import java.util.Arrays;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxx
{
    public aokx a;
    public aolb b;
    public Set c;
    public aolb d;
    public Set e;
    public aolb f;
    public Set g;
    public boolean h;
    private aolb[] i;
    private aolc[] j;
    
    public acxx() {
        this.a = null;
    }
    
    public final CharSequence a() {
        final aokx a = this.a;
        if (a != null) {
            aibc aibc;
            if ((aibc = a.i) == null) {
                aibc = aibc.a;
            }
            if ((aibc.b & 0x1) != 0x0) {
                aibc aibc2;
                if ((aibc2 = this.a.i) == null) {
                    aibc2 = aibc.a;
                }
                aibb aibb;
                if ((aibb = aibc2.c) == null) {
                    aibb = aibb.a;
                }
                ajsq ajsq;
                if ((ajsq = aibb.i) == null) {
                    ajsq = ajsq.a;
                }
                return (CharSequence)abyh.b(ajsq);
            }
        }
        return null;
    }
    
    public final CharSequence b() {
        final aokx a = this.a;
        if (a != null) {
            aibc aibc;
            if ((aibc = a.h) == null) {
                aibc = aibc.a;
            }
            if ((aibc.b & 0x1) != 0x0) {
                aibc aibc2;
                if ((aibc2 = this.a.h) == null) {
                    aibc2 = aibc.a;
                }
                aibb aibb;
                if ((aibb = aibc2.c) == null) {
                    aibb = aibb.a;
                }
                ajsq ajsq;
                if ((ajsq = aibb.i) == null) {
                    ajsq = ajsq.a;
                }
                return (CharSequence)abyh.b(ajsq);
            }
        }
        return null;
    }
    
    public final aolb[] c() {
        if (this.i == null) {
            this.i = new aolb[this.a.c.size()];
            for (int i = 0; i < this.a.c.size(); ++i) {
                final aoky aoky = (aoky)this.a.c.get(i);
                aolb a;
                if (aoky.b == 119719473) {
                    a = (aolb)aoky.c;
                }
                else {
                    a = aolb.a;
                }
                this.i[i] = a;
            }
        }
        return this.i;
    }
    
    public final aolc[] d() {
        if (this.j == null) {
            this.j = new aolc[this.a.d.size()];
            for (int i = 0; i < this.a.d.size(); ++i) {
                final aokz aokz = (aokz)this.a.d.get(i);
                aolc a;
                if (aokz.b == 94522740) {
                    a = (aolc)aokz.c;
                }
                else {
                    a = aolc.a;
                }
                this.j[i] = a;
            }
        }
        return this.j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof acxx)) {
            return false;
        }
        final acxx acxx = (acxx)o;
        if (aeda.v(acxx.a, this.a) && acxx.e.equals(this.e) && aeda.v(acxx.d, this.d) && aeda.v(acxx.b, this.b) && acxx.c.equals(this.c)) {
            if (aeda.v(acxx.f, this.f)) {
                final Set g = acxx.g;
                if (g == null && this.g == null) {
                    return true;
                }
                if (g == null) {
                    this.g.getClass();
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { Arrays.hashCode(((agxl)this.a).toByteArray()), Arrays.hashCode(((agxl)this.d).toByteArray()), this.e, this.c, Arrays.hashCode(((agxl)this.b).toByteArray()), Arrays.hashCode(((agxl)this.f).toByteArray()), this.g });
    }
}
