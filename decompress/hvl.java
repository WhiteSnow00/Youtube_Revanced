import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.List;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvl implements zpf
{
    final Object a;
    final Object b;
    private final int c;
    
    public hvl(final dbf a, final dbe b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hvl(final fjo b, final vkk a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hvl(final hvm b, final zpf a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hvl(final hzu b, final zpf a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void a(final dbj d) {
        final int c = this.c;
        if (c == 0) {
            ((zpf)this.a).a(d);
            return;
        }
        if (c == 1) {
            ((fjo)this.b).f(d);
            if (((fjo)this.b).m((vkk)this.a)) {
                final fjo fjo = (fjo)this.b;
                fjo.d = d;
                if (fjo.e != null) {
                    fjo.k(d);
                    ((fjo)this.b).j();
                }
            }
            return;
        }
        if (c != 2) {
            ((dbe)this.b).a(d);
            return;
        }
        ((zpf)this.a).a(d);
    }
    
    public final void mX(final Object b) {
        final int c = this.c;
        if (c == 0) {
            if (b instanceof BrowseResponseModel) {
                final pvh a = ((hvm)this.b).a;
                final akhz a2 = ((BrowseResponseModel)b).a;
                ((hwl)a.a).bC((List)a2.w);
                ((hwl)a.a).bW.b(a2);
            }
            ((zpf)this.a).mX(b);
            return;
        }
        if (c == 1) {
            ((fjo)this.b).g(b);
            if (((fjo)this.b).m((vkk)this.a)) {
                final fjo fjo = (fjo)this.b;
                fjo.b = b;
                fjo.d = null;
                fjo.c = fjo.a.d();
                final fjo fjo2 = (fjo)this.b;
                if (fjo2.e != null) {
                    final zpf b2 = fjo2.b();
                    if (b2 != null) {
                        b2.mX(b);
                    }
                    ((fjo)this.b).j();
                }
            }
            return;
        }
        if (c != 2) {
            ((dbf)this.a).mX(b);
            return;
        }
        if (b instanceof WatchNextResponseModel) {
            final WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel)b;
            final alem a3 = watchNextResponseModel.a;
            ((hzu)this.b).a.a(a3);
            if (a3.v.size() != 0) {
                ((hzu)this.b).b.b((List)a3.v);
            }
            if (((hzu)this.b).c.h()) {
                ((uve)((hzu)this.b).c.c()).j(watchNextResponseModel);
            }
        }
        ((zpf)this.a).mX(b);
    }
    
    public final void mY() {
    }
}
