import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apeh extends agzi implements ahax
{
    public static final apeh a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    
    static {
        agzi.registerDefaultInstance(apeh.class, a = new apeh());
    }
    
    private apeh() {
        this.c = "";
        this.d = "";
        this.e = "";
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
                if ((h = apeh.h) == null) {
                    synchronized (apeh.class) {
                        if (apeh.h == null) {
                            apeh.h = (ahbe)new agzb((agzi)apeh.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return apeh.a;
            }
            case 4: {
                return new agza((agzi)apeh.a);
            }
            case 3: {
                return new apeh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apeh.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1007\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
