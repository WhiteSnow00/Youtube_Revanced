import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexp extends asiz
{
    public aexp(final arws arws, final arwr arwr) {
        super(arws, arwr);
    }
    
    public final /* bridge */ asjc a(final arws arws, final arwr arwr) {
        return new aexp(arws, arwr);
    }
    
    public final asjm b(final asjm asjm) {
        final arws a = super.a;
        Object o;
        if ((o = aexq.a) == null) {
            synchronized (aexq.class) {
                if ((o = aexq.a) == null) {
                    o = arzi.a();
                    ((arzf)o).c = arzh.d;
                    ((arzf)o).d = arzi.c("google.assistant.embedded.v1.EmbeddedAssistant", "YTAssist");
                    ((arzf)o).b();
                    ((arzf)o).a = asiy.b((MessageLite)aexi.a);
                    ((arzf)o).b = asiy.b((MessageLite)aexj.a);
                    o = (aexq.a = ((arzf)o).a());
                }
            }
        }
        return asjj.b(a.a((arzi)o, super.b), asjm);
    }
}
