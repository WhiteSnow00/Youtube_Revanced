import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.Collection;
import j$.util.Collection$_EL;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import j$.util.function.Function$_CC;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifj implements Function
{
    public static final ifj a;
    public static final ifj b;
    public static final ifj c;
    public static final ifj d;
    public static final ifj e;
    public static final ifj f;
    public static final ifj g;
    public static final ifj h;
    public static final ifj i;
    public static final ifj j;
    public static final ifj k;
    public static final ifj l;
    public static final ifj m;
    public static final ifj n;
    public static final ifj o;
    public static final ifj p;
    public static final ifj q;
    public static final ifj r;
    public static final ifj s;
    public static final ifj t;
    private final int u;
    
    static {
        t = new ifj(20);
        s = new ifj(19);
        r = new ifj(18);
        q = new ifj(17);
        p = new ifj(16);
        o = new ifj(15);
        n = new ifj(14);
        m = new ifj(13);
        l = new ifj(12);
        k = new ifj(11);
        j = new ifj(10);
        i = new ifj(9);
        h = new ifj(8);
        g = new ifj(7);
        f = new ifj(5);
        e = new ifj(4);
        d = new ifj(3);
        c = new ifj(2);
        b = new ifj(1);
        a = new ifj(0);
    }
    
    public ifj(final int u) {
        this.u = u;
    }
    
    @Override
    public final Function andThen(final Function function) {
        switch (this.u) {
            default: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 19: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 18: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 17: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 16: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 15: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 14: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 13: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 12: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 11: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 10: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 9: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 8: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 7: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 6: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 5: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 4: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 3: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 2: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 1: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 0: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
        }
    }
    
    @Override
    public final Object apply(final Object o) {
        final int u = this.u;
        final Boolean value = true;
        switch (u) {
            default: {
                return ((aezp)o).c();
            }
            case 19: {
                return ((aaba)o).f();
            }
            case 18: {
                return ((aabf)o).a();
            }
            case 17: {
                amwz amwz;
                if ((amwz = amwz.b(((amtb)o).c)) == null) {
                    amwz = amwz.a;
                }
                return amwz;
            }
            case 16: {
                amwz amwz2;
                if ((amwz2 = amwz.b(((amtb)o).c)) == null) {
                    amwz2 = amwz.a;
                }
                return amwz2;
            }
            case 15: {
                amta amta;
                if ((amta = amta.b(((amtb)o).d)) == null) {
                    amta = amta.a;
                }
                return amta;
            }
            case 14: {
                final BrowseResponseModel browseResponseModel = new BrowseResponseModel((akhz)o);
                browseResponseModel.i("browse_response_enable_logging", (Object)false);
                browseResponseModel.i("browse_response_new_response_needed", (Object)value);
                browseResponseModel.i("browse_response_is_loading_response", (Object)value);
                return browseResponseModel;
            }
            case 13: {
                final BrowseResponseModel browseResponseModel2 = new BrowseResponseModel((akhz)o);
                browseResponseModel2.i("browse_response_enable_logging", (Object)value);
                browseResponseModel2.i("browse_response_new_response_needed", (Object)value);
                browseResponseModel2.i("browse_response_is_loading_response", (Object)value);
                return browseResponseModel2;
            }
            case 12: {
                final aoir bp = (aoir)o;
                final ahaz builder = ((ahbh)anyy.a).createBuilder();
                builder.copyOnWrite();
                final anyy anyy = (anyy)builder.instance;
                bp.getClass();
                anyy.bp = bp;
                anyy.e |= 0x40000;
                return afeq.r((Object)builder.build());
            }
            case 11: {
                final anjb c = (anjb)o;
                final ahaz builder2 = aleb.a.createBuilder();
                builder2.copyOnWrite();
                final aleb aleb = (aleb)builder2.instance;
                c.getClass();
                aleb.c = c;
                aleb.b = 50631000;
                return builder2.build();
            }
            case 10: {
                return ((idz)o).a;
            }
            case 9: {
                return Collection$_EL.stream((Collection)((amwl)o).getStreamsProgress());
            }
            case 8: {
                final amwl amwl = (amwl)o;
                final int c2 = iiu.c;
                return Collection$_EL.stream((Collection)amwl.getStreamsProgress());
            }
            case 7: {
                return Collection$_EL.stream((Collection)o);
            }
            case 6: {
                return afeq.o((Collection)((amuh)((ahbc)((ahbc)o).rx((ahaq)ajmu.a)).rx((ahaq)amuh.b)).c);
            }
            case 5: {
                return ((aaba)o).f();
            }
            case 4: {
                final amwl amwl2 = (amwl)o;
                final int e = igu.e;
                return Collection$_EL.stream((Collection)amwl2.getStreamsProgress());
            }
            case 3: {
                return ((amul)o).d;
            }
            case 2: {
                amwq amwq;
                if ((amwq = amwq.b(((ajfu)o).f)) == null) {
                    amwq = amwq.a;
                }
                return amwq;
            }
            case 1: {
                final afft a = ieu.a;
                return o;
            }
            case 0: {
                return Collection$_EL.stream((Collection)o);
            }
        }
    }
    
    @Override
    public final Function compose(final Function function) {
        switch (this.u) {
            default: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 19: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 18: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 17: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 16: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 15: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 14: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 13: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 12: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 11: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 10: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 9: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 8: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 7: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 6: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 5: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 4: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 3: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 2: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 1: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 0: {
                return Function$_CC.$default$compose((Function)this, function);
            }
        }
    }
}
