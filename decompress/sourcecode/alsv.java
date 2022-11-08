import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alsv extends agzi implements ahax
{
    public static final alsv a;
    public static final agzg b;
    private static volatile ahbe h;
    public int c;
    public int d;
    public Object e;
    public String f;
    public String g;
    
    static {
        final alsv a2 = new alsv();
        agzi.registerDefaultInstance(alsv.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)amsf.b, a2, (MessageLite)a2, null, 318835310, ahcm.k, alsv.class);
    }
    
    private alsv() {
        this.d = 0;
        this.f = "";
        this.g = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = alsv.h) == null) {
                    synchronized (alsv.class) {
                        if (alsv.h == null) {
                            alsv.h = (ahbe)new agzb((agzi)alsv.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alsv.a;
            }
            case 4: {
                return new agza((agzi)alsv.a);
            }
            case 3: {
                return new alsv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alsv.a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u1008\u0002\u0003\u1008\u0003\u0004\u103b\u0000", new Object[] { "e", "d", "c", "f", "g" });
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
