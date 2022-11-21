import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqs extends ahcz implements aheo
{
    public static final aqqs a;
    public static final ahcx b;
    private static volatile ahev r;
    public int c;
    public aqgs d;
    public String e;
    public String f;
    public boolean g;
    public float h;
    public ahdp i;
    public ahdp j;
    public int k;
    public int l;
    public int m;
    public float n;
    public float o;
    public float p;
    public String q;
    private boolean s;
    private byte t;
    
    static {
        final aqqs a2 = new aqqs();
        ahcz.registerDefaultInstance(aqqs.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), a2, (MessageLite)a2, null, 220721894, ahgc.k, aqqs.class);
    }
    
    private aqqs() {
        this.t = 2;
        this.e = "";
        this.f = "";
        this.i = ahcz.emptyProtobufList();
        this.j = ahcz.emptyProtobufList();
        this.q = "";
    }
    
    public static void a(final aqqs aqqs) {
        aqqs.c |= 0x80;
        aqqs.s = false;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte t = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev r;
                if ((r = aqqs.r) == null) {
                    synchronized (aqqs.class) {
                        if (aqqs.r == null) {
                            aqqs.r = (ahev)new ahcs((ahcz)aqqs.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return aqqs.a;
            }
            case 4: {
                return new ahcr((short[][])null, (char[])null);
            }
            case 3: {
                return new aqqs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqs.a, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0002\u0002\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1007\u0003\u0004\u1001\u0004\u0007\u001b\b\u1008\u0002\t\u1007\u0007\n\u1004\b\u000b\u1004\t\f\u1004\n\r\u041b\u000e\u1001\u000b\u000f\u1001\f\u0010\u1001\r\u0011\u1008\u000e", new Object[] { "c", "d", "e", "g", "h", "i", aqqm.class, "f", "s", "k", "l", "m", "j", ajqp.class, "n", "o", "p", "q" });
            }
            case 1: {
                if (o == null) {
                    t = 0;
                }
                this.t = t;
                return null;
            }
            case 0: {
                return this.t;
            }
        }
    }
}
