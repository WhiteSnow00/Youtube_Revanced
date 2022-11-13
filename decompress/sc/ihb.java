import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;
import com.google.android.libraries.blocks.Container;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class ihb
{
    public final Context a;
    public final afvs b;
    public final aezp c;
    public final vai d;
    public final vai e;
    public final arwh f;
    public final heo g;
    public final fzw h;
    private final vai i;
    
    public ihb(final Context a, final arwh f, final afvs b, final vai d, final vai e, final heo g, final atke atke, final vai i, final fzw h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.f = f;
        this.b = b;
        this.d = d;
        this.e = e;
        this.g = g;
        this.i = i;
        this.h = h;
        Object c;
        if (d.f(45371923L)) {
            c = aezp.k((Object)((Container)atke.a()).d((obo)new aewo(6)));
        }
        else {
            c = aeyo.a;
        }
        this.c = (aezp)c;
    }
    
    public final ajfy a(final afeq afeq, final afeq afeq2, final afeq afeq3, final int n, final String j, final boolean h) {
        final ahaz builder = ((ahbh)ajfy.a).createBuilder();
        final String string = this.a.getString(2132018886);
        builder.copyOnWrite();
        final ajfy ajfy = (ajfy)builder.instance;
        string.getClass();
        ajfy.b |= 0x1;
        ajfy.c = string;
        final String string2 = this.a.getString(2132018887);
        builder.copyOnWrite();
        final ajfy ajfy2 = (ajfy)builder.instance;
        string2.getClass();
        ajfy2.b |= 0x2;
        ajfy2.f = string2;
        final String quantityString = this.a.getResources().getQuantityString(2131886124, n, new Object[] { n });
        builder.copyOnWrite();
        final ajfy ajfy3 = (ajfy)builder.instance;
        quantityString.getClass();
        ajfy3.b |= 0x4;
        ajfy3.g = quantityString;
        builder.copyOnWrite();
        final ajfy ajfy4 = (ajfy)builder.instance;
        ajfy4.b |= 0x8;
        ajfy4.h = h;
        final ahaz builder2 = ((ahbh)ajfv.a).createBuilder();
        final String string3 = this.a.getString(2132017390);
        builder2.copyOnWrite();
        final ajfv ajfv = (ajfv)builder2.instance;
        string3.getClass();
        ajfv.b |= 0x1;
        ajfv.c = string3;
        final ajfv i = (ajfv)builder2.build();
        builder.copyOnWrite();
        final ajfy ajfy5 = (ajfy)builder.instance;
        i.getClass();
        ajfy5.i = i;
        ajfy5.b |= 0x20;
        if (!afeq.isEmpty()) {
            final ahaz builder3 = ((ahbh)ajfx.a).createBuilder();
            final String string4 = this.a.getString(2132017913);
            builder3.copyOnWrite();
            final ajfx ajfx = (ajfx)builder3.instance;
            string4.getClass();
            ajfx.b |= 0x1;
            ajfx.c = string4;
            builder.copyOnWrite();
            final ajfy ajfy6 = (ajfy)builder.instance;
            final ajfx l = (ajfx)builder3.build();
            l.getClass();
            ajfy6.l = l;
            ajfy6.b |= 0x200;
            builder.copyOnWrite();
            final ajfy ajfy7 = (ajfy)builder.instance;
            final ahbx d = ajfy7.d;
            if (!d.c()) {
                ajfy7.d = ahbh.mutableCopy(d);
            }
            agzk.addAll((Iterable)afeq, (List)ajfy7.d);
            builder.copyOnWrite();
            final ajfy ajfy8 = (ajfy)builder.instance;
            final ahbx k = ajfy8.k;
            if (!k.c()) {
                ajfy8.k = ahbh.mutableCopy(k);
            }
            agzk.addAll((Iterable)afeq3, (List)ajfy8.k);
        }
        if (!afeq2.isEmpty()) {
            builder.copyOnWrite();
            final ajfy ajfy9 = (ajfy)builder.instance;
            final ahbx e = ajfy9.e;
            if (!e.c()) {
                ajfy9.e = ahbh.mutableCopy(e);
            }
            agzk.addAll((Iterable)afeq2, (List)ajfy9.e);
            final ahaz builder4 = ((ahbh)ajfx.a).createBuilder();
            final String string5 = this.a.getString(2132017904);
            builder4.copyOnWrite();
            final ajfx ajfx2 = (ajfx)builder4.instance;
            string5.getClass();
            ajfx2.b |= 0x1;
            ajfx2.c = string5;
            final String string6 = this.a.getString(2132017903);
            builder4.copyOnWrite();
            final ajfx ajfx3 = (ajfx)builder4.instance;
            string6.getClass();
            ajfx3.b |= 0x2;
            ajfx3.d = string6;
            final ajfx m = (ajfx)builder4.build();
            builder.copyOnWrite();
            final ajfy ajfy10 = (ajfy)builder.instance;
            m.getClass();
            ajfy10.m = m;
            ajfy10.b |= 0x400;
        }
        if (j != null) {
            builder.copyOnWrite();
            final ajfy ajfy11 = (ajfy)builder.instance;
            ajfy11.b |= 0x40;
            ajfy11.j = j;
        }
        return (ajfy)builder.build();
    }
    
    public final ajgb b(final afeq afeq, final String d, final String d2, final int n, final aezp aezp, final String n2, final boolean m) {
        final String string = this.a.getString(2132017611);
        final String string2 = this.a.getString(2132017902);
        String c = string;
        String c2 = string2;
        if (!this.i.aO()) {
            c = aevy.c(string);
            c2 = aevy.c(string2);
        }
        final ahaz builder = ((ahbh)ajgb.a).createBuilder();
        builder.copyOnWrite();
        final ajgb ajgb = (ajgb)builder.instance;
        c.getClass();
        ajgb.b |= 0x2;
        ajgb.h = c;
        builder.copyOnWrite();
        final ajgb ajgb2 = (ajgb)builder.instance;
        if (n != 0) {
            ajgb2.g = n - 1;
            ajgb2.b |= 0x1;
            final String c3 = aevy.c(this.a.getString(2132018885));
            builder.copyOnWrite();
            final ajgb ajgb3 = (ajgb)builder.instance;
            c3.getClass();
            ajgb3.b |= 0x4;
            ajgb3.i = c3;
            builder.copyOnWrite();
            final ajgb ajgb4 = (ajgb)builder.instance;
            c2.getClass();
            ajgb4.b |= 0x8;
            ajgb4.j = c2;
            builder.copyOnWrite();
            final ajgb ajgb5 = (ajgb)builder.instance;
            ajgb5.b |= 0x400;
            ajgb5.m = m;
            if (d != null) {
                builder.copyOnWrite();
                final ajgb ajgb6 = (ajgb)builder.instance;
                ajgb6.c = 6;
                ajgb6.d = d;
            }
            else if (d2 != null) {
                builder.copyOnWrite();
                final ajgb ajgb7 = (ajgb)builder.instance;
                ajgb7.c = 7;
                ajgb7.d = d2;
            }
            if (aezp.h()) {
                final ahab f = (ahab)aezp.c();
                builder.copyOnWrite();
                final ajgb ajgb8 = (ajgb)builder.instance;
                ajgb8.e = 8;
                ajgb8.f = f;
            }
            if (n == 2) {
                final ahbb ahbb = (ahbb)((ahbh)CommandOuterClass$Command.a).createBuilder();
                ahbb.e((ahaq)ajev.b, (Object)ajev.a);
                final CommandOuterClass$Command k = (CommandOuterClass$Command)((ahaz)ahbb).build();
                builder.copyOnWrite();
                final ajgb ajgb9 = (ajgb)builder.instance;
                k.getClass();
                ajgb9.k = k;
                ajgb9.b |= 0x10;
            }
            else if (n == 3) {
                final ahbb ahbb2 = (ahbb)((ahbh)CommandOuterClass$Command.a).createBuilder();
                ahbb2.e((ahaq)aqnm.b, (Object)aqnm.a);
                final CommandOuterClass$Command i = (CommandOuterClass$Command)((ahaz)ahbb2).build();
                builder.copyOnWrite();
                final ajgb ajgb10 = (ajgb)builder.instance;
                i.getClass();
                ajgb10.k = i;
                ajgb10.b |= 0x10;
            }
            if (!afeq.isEmpty()) {
                builder.copyOnWrite();
                final ajgb ajgb11 = (ajgb)builder.instance;
                final ahbx l = ajgb11.l;
                if (!l.c()) {
                    ajgb11.l = ahbh.mutableCopy(l);
                }
                agzk.addAll((Iterable)afeq, (List)ajgb11.l);
            }
            if (n2 != null) {
                builder.copyOnWrite();
                final ajgb ajgb12 = (ajgb)builder.instance;
                ajgb12.b |= 0x800;
                ajgb12.n = n2;
            }
            return (ajgb)builder.build();
        }
        throw null;
    }
}
