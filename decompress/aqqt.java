import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqt extends ahcz implements aheo
{
    private static volatile ahev C;
    public static final aqqt a;
    public static final ahcx b;
    public String A;
    public boolean B;
    private byte D;
    public int c;
    public aqgs d;
    public aqgs e;
    public CommandOuterClass$Command f;
    public CommandOuterClass$Command g;
    public CommandOuterClass$Command h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public ahdp o;
    public ahdp p;
    public ahdp q;
    public boolean r;
    public ahdp s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public ahdp x;
    public boolean y;
    public boolean z;
    
    static {
        final aqqt a2 = new aqqt();
        ahcz.registerDefaultInstance(aqqt.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqkf.a, a2, (MessageLite)a2, null, 220721894, ahgc.k, aqqt.class);
    }
    
    private aqqt() {
        this.D = 2;
        this.j = true;
        this.o = ahcz.emptyProtobufList();
        this.p = ahcz.emptyProtobufList();
        this.q = ahcz.emptyProtobufList();
        this.s = ahcz.emptyProtobufList();
        this.x = ahcz.emptyProtobufList();
        this.A = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aqqt.C) == null) {
                    synchronized (aqqt.class) {
                        if (aqqt.C == null) {
                            aqqt.C = (ahev)new ahcs((ahcz)aqqt.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqqt.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqt.a);
            }
            case 3: {
                return new aqqt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqt.a, "\u0001\u0019\u0000\u0001\u0001\u001e\u0019\u0000\u0005\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1007\u0005\u0007\u1007\f\b\u1007\u0006\n\u001b\u000b\u1007\u0007\r\u001a\u000f\u041b\u0010\u1007\t\u0011\u1007\u0015\u0012\u1007\u000e\u0013\u001b\u0014\u1007\u000f\u0015\u1007\u0011\u0016\u1007\u0013\u0017\u1007\u0010\u0018\u041b\u0019\u1007\u000b\u001a\u1007\u0012\u001c\u1008\u0014\u001e\u1007\n", new Object[] { "c", "d", "e", "f", "g", "h", "i", "r", "j", "s", aqqm.class, "k", "o", "q", aqqr.class, "l", "B", "t", "p", aqqu.class, "u", "w", "z", "v", "x", ajqp.class, "n", "y", "A", "m" });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.D = d;
                return null;
            }
            case 0: {
                return this.D;
            }
        }
    }
}
