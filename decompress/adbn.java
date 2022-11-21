import java.util.Arrays;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adbn
{
    public aopk a;
    public aopo b;
    public Set c;
    public aopo d;
    public Set e;
    public aopo f;
    public Set g;
    public boolean h;
    private aopo[] i;
    private aopp[] j;
    
    public adbn() {
        this.a = null;
    }
    
    public final CharSequence a() {
        final aopk a = this.a;
        if (a != null) {
            aiet aiet;
            if ((aiet = a.i) == null) {
                aiet = aiet.a;
            }
            if ((aiet.b & 0x1) != 0x0) {
                aiet aiet2;
                if ((aiet2 = this.a.i) == null) {
                    aiet2 = aiet.a;
                }
                aies aies;
                if ((aies = aiet2.c) == null) {
                    aies = aies.a;
                }
                ajws ajws;
                if ((ajws = aies.i) == null) {
                    ajws = ajws.a;
                }
                return (CharSequence)acbu.b(ajws);
            }
        }
        return null;
    }
    
    public final CharSequence b() {
        final aopk a = this.a;
        if (a != null) {
            aiet aiet;
            if ((aiet = a.h) == null) {
                aiet = aiet.a;
            }
            if ((aiet.b & 0x1) != 0x0) {
                aiet aiet2;
                if ((aiet2 = this.a.h) == null) {
                    aiet2 = aiet.a;
                }
                aies aies;
                if ((aies = aiet2.c) == null) {
                    aies = aies.a;
                }
                ajws ajws;
                if ((ajws = aies.i) == null) {
                    ajws = ajws.a;
                }
                return (CharSequence)acbu.b(ajws);
            }
        }
        return null;
    }
    
    public final aopo[] c() {
        if (this.i == null) {
            this.i = new aopo[this.a.c.size()];
            for (int i = 0; i < this.a.c.size(); ++i) {
                final aopl aopl = (aopl)this.a.c.get(i);
                aopo a;
                if (aopl.b == 119719473) {
                    a = (aopo)aopl.c;
                }
                else {
                    a = aopo.a;
                }
                this.i[i] = a;
            }
        }
        return this.i;
    }
    
    public final aopp[] d() {
        if (this.j == null) {
            this.j = new aopp[this.a.d.size()];
            for (int i = 0; i < this.a.d.size(); ++i) {
                final aopm aopm = (aopm)this.a.d.get(i);
                aopp a;
                if (aopm.b == 94522740) {
                    a = (aopp)aopm.c;
                }
                else {
                    a = aopp.a;
                }
                this.j[i] = a;
            }
        }
        return this.j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof adbn)) {
            return false;
        }
        final adbn adbn = (adbn)o;
        if (aexq.c(adbn.a, this.a) && adbn.e.equals(this.e) && aexq.c(adbn.d, this.d) && aexq.c(adbn.b, this.b) && adbn.c.equals(this.c)) {
            if (aexq.c(adbn.f, this.f)) {
                final Set g = adbn.g;
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
        return Arrays.hashCode(new Object[] { Arrays.hashCode(this.a.toByteArray()), Arrays.hashCode(this.d.toByteArray()), this.e, this.c, Arrays.hashCode(this.b.toByteArray()), Arrays.hashCode(this.f.toByteArray()), this.g });
    }
}
