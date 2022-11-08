import android.database.Cursor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jla implements adee
{
    private final zki a;
    private final aeim b;
    
    public jla(final aeim b, final zki a, final byte[] array, final byte[] array2, final byte[] array3) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    private final agmd f(final String s) {
        final agza builder = ((agzi)anvz.a).createBuilder();
        Object o = this.b.E(s);
        try {
            if (((Cursor)o).moveToFirst()) {
                final int columnIndex = ((Cursor)o).getColumnIndex("suggest_intent_query");
                int c = 0;
                boolean moveToNext;
                do {
                    final String string = ((Cursor)o).getString(columnIndex);
                    int n = c;
                    if (string != null) {
                        final agza builder2 = ((agzi)anwa.a).createBuilder();
                        final agza builder3 = ((agzi)anvy.a).createBuilder();
                        final agzc agzc = (agzc)((agzi)ajsq.a).createBuilder();
                        final agzc agzc2 = (agzc)((agzi)ajss.a).createBuilder();
                        ((agza)agzc2).copyOnWrite();
                        final ajss ajss = (ajss)agzc2.instance;
                        ajss.b |= 0x1;
                        ajss.c = string;
                        agzc.i((ajss)((agza)agzc2).build());
                        final ajsq c2 = (ajsq)((agza)agzc).build();
                        builder3.copyOnWrite();
                        final anvy anvy = (anvy)builder3.instance;
                        c2.getClass();
                        anvy.c = c2;
                        anvy.b |= 0x1;
                        final agza builder4 = ((agzi)akxf.a).createBuilder();
                        builder4.copyOnWrite();
                        final akxf akxf = (akxf)builder4.instance;
                        akxf.b |= 0x1;
                        akxf.c = c;
                        builder4.copyOnWrite();
                        final akxf akxf2 = (akxf)builder4.instance;
                        akxf2.f = 0;
                        akxf2.b |= 0x8;
                        builder4.copyOnWrite();
                        final akxf akxf3 = (akxf)builder4.instance;
                        akxf3.b |= 0x2;
                        akxf3.d = 0;
                        final akxf d = (akxf)builder4.build();
                        builder3.copyOnWrite();
                        final anvy anvy2 = (anvy)builder3.instance;
                        d.getClass();
                        anvy2.d = d;
                        anvy2.b |= 0x10;
                        final anvy d2 = (anvy)builder3.build();
                        builder2.copyOnWrite();
                        final anwa anwa = (anwa)builder2.instance;
                        d2.getClass();
                        anwa.d = d2;
                        anwa.b |= 0x2;
                        builder.by((anwa)builder2.build());
                        n = c + 1;
                    }
                    moveToNext = ((Cursor)o).moveToNext();
                    c = n;
                } while (moveToNext);
            }
            ((Cursor)o).close();
            o = ((agzi)akwr.a).createBuilder();
            final agza builder5 = ((agzi)akwy.a).createBuilder();
            final anvz c3 = (anvz)builder.build();
            builder5.copyOnWrite();
            final akwy akwy = (akwy)builder5.instance;
            c3.getClass();
            akwy.c = c3;
            akwy.b = 87359530;
            ((agza)o).aZ((akwy)builder5.build());
            return new agmd(s, (akwr)((agza)o).build());
        }
        finally {
            ((Cursor)o).close();
            while (true) {}
        }
    }
    
    private static final agmd g(final String s) {
        return new agmd(s, akwr.a);
    }
    
    public final ListenableFuture a(final String s, final aexq aexq) {
        return this.e(s);
    }
    
    public final ListenableFuture b() {
        return afva.m(g(""));
    }
    
    public final ListenableFuture c() {
        if (!this.a.c().z()) {
            return afva.m(g(""));
        }
        return afva.m(this.f(""));
    }
    
    public final void d() {
    }
    
    public final ListenableFuture e(final String s) {
        if (!this.a.c().z()) {
            return afva.m(g(s));
        }
        return afva.m(this.f(s));
    }
}
