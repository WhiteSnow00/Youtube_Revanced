import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.function.Consumer;
import j$.util.Optional;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jel extends abfn implements abgj, abor
{
    private final aaxx c;
    private boolean d;
    private int e;
    private int[] f;
    private int[] g;
    private final agnt h;
    
    public jel(final jen jen, final aaxx c, final aln aln, final agnt h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super((abfw)jen, aln, (byte[])null, (byte[])null);
        this.c = c;
        this.h = h;
    }
    
    public final int a() {
        if (this.d) {
            final int[] f = this.f;
            if (f != null && ((abfl)this).j() < ((int[])aefb.K((Object)f)).length) {
                final int n = ((int[])aefb.K((Object)this.f))[((abfl)this).j()];
                int n2;
                if ((n2 = n) == this.e) {
                    n2 = n;
                    if (super.a != 1) {
                        n2 = -1;
                    }
                }
                return n2;
            }
        }
        return super.a();
    }
    
    public final int b() {
        if (this.d) {
            final int[] g = this.g;
            if (g != null && ((abfl)this).j() < ((int[])aefb.K((Object)g)).length) {
                if (((abfl)this).j() == this.e && super.a != 1) {
                    return -1;
                }
                return ((int[])aefb.K((Object)this.g))[((abfl)this).j()];
            }
        }
        return super.b();
    }
    
    public final PlaybackStartDescriptor c(final abop abop) {
        final PlaybackStartDescriptor c = super.c(abop);
        if (c == null) {
            return null;
        }
        final aiqj b = c.b;
        aiqj f;
        if (b == null) {
            f = null;
        }
        else {
            final ahaz builder = ((ahbh)amqg.a).createBuilder();
            final aboo a = aboo.a;
            final int ordinal = abop.e.ordinal();
            aiqj aiqj = null;
            Label_0251: {
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2 && ordinal != 3) {
                            aiqj = b;
                            if (ordinal == 4) {
                                break Label_0251;
                            }
                            aiqj = b;
                            if (ordinal == 5) {
                                break Label_0251;
                            }
                        }
                        else {
                            builder.copyOnWrite();
                            final amqg amqg = (amqg)builder.instance;
                            amqg.b |= 0x2;
                            amqg.d = 6192;
                        }
                    }
                    else {
                        builder.copyOnWrite();
                        final amqg amqg2 = (amqg)builder.instance;
                        amqg2.b |= 0x2;
                        amqg2.d = 6194;
                    }
                }
                else {
                    builder.copyOnWrite();
                    final amqg amqg3 = (amqg)builder.instance;
                    amqg3.b |= 0x2;
                    amqg3.d = 6193;
                }
                final ahbb ahbb = (ahbb)((ahbh)b).toBuilder();
                ((ahaz)ahbb).copyOnWrite();
                final aiqj aiqj2 = (aiqj)ahbb.instance;
                aiqj2.b &= 0xFFFFFFFE;
                aiqj2.c = aiqj.a.c;
                ahbb.e((ahaq)amqf.b, (Object)builder.build());
                aiqj = (aiqj)((ahaz)ahbb).build();
            }
            f = aiqj;
            if (this.c.a() != null) {
                f = this.c.a().f(aiqj);
            }
        }
        if (f == null) {
            return null;
        }
        final abjp e = c.e();
        ((Optional)this.h.b).ifPresent((Consumer)new inj(e, 19));
        e.a = f;
        return e.a();
    }
    
    public final abop d(final PlaybackStartDescriptor playbackStartDescriptor, final abjt abjt) {
        if (playbackStartDescriptor.i().isEmpty()) {
            return null;
        }
        return super.d(playbackStartDescriptor, abjt);
    }
    
    public final void e() {
        ((abfl)this).q();
        super.a = 0;
        this.pC(false);
        this.g = null;
        this.f = null;
    }
    
    public final void pC(final boolean d) {
        this.d = d;
        if (d && (this.f == null || this.g == null)) {
            final int n = 0;
            final int i = ((abfl)this).i(0);
            this.e = ((abfl)this).j();
            final ArrayList list = new ArrayList();
            for (int j = 0; j < i; ++j) {
                list.add(j);
            }
            Collections.shuffle(list);
            this.f = new int[i];
            this.g = new int[i];
            int n2;
            for (int k = n; k < i; k = n2) {
                final int intValue = (int)list.get(k);
                final int[] f = this.f;
                n2 = k + 1;
                f[intValue] = (int)list.get(n2 % i);
                this.g[intValue] = (int)list.get((k - 1 + i) % i);
            }
        }
    }
    
    public final boolean pD() {
        return this.d;
    }
    
    public final boolean pE() {
        return true;
    }
}
