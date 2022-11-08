import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahoq extends agzi implements ahax
{
    public static final agzr a;
    public static final ahoq b;
    private static volatile ahbe p;
    public int c;
    public agzy d;
    public agzq e;
    public ahir f;
    public boolean g;
    public boolean h;
    public amxp i;
    public float j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    private int q;
    
    static {
        a = (agzr)new prz(10);
        agzi.registerDefaultInstance(ahoq.class, b = new ahoq());
    }
    
    private ahoq() {
        this.d = agzi.emptyProtobufList();
        this.e = agzi.emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe p3;
                if ((p3 = ahoq.p) == null) {
                    synchronized (ahoq.class) {
                        if (ahoq.p == null) {
                            ahoq.p = (ahbe)new agzb((agzi)ahoq.b);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return ahoq.b;
            }
            case 4: {
                return new agza((agzi)ahoq.b);
            }
            case 3: {
                return new ahoq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahoq.b, "\u0001\f\u0000\u0002\u0002)\f\u0000\u0002\u0000\u0002\u001b\u0005\u001e\r\u1009\t\u000e\u1007\n\u000f\u1007\u000b\u0013\u1009\u000f\u0015\u1001\u0011\u001b\u1007\u0017 \u1007\u001b!\u1007\u001c%\u1007 )\u1007$", new Object[] { "c", "q", "d", ahri.class, "e", ahpu.a(), "f", "g", "h", "i", "j", "k", "l", "m", "n", "o" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
