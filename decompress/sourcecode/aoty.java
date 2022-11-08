import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoty extends agzi implements ahax
{
    public static final aoty a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    
    static {
        agzi.registerDefaultInstance(aoty.class, a = new aoty());
    }
    
    private aoty() {
        this.c = "";
        this.d = "";
        this.e = "";
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
                if ((h = aoty.h) == null) {
                    synchronized (aoty.class) {
                        if (aoty.h == null) {
                            aoty.h = (ahbe)new agzb((agzi)aoty.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aoty.a;
            }
            case 4: {
                return new agza((agzi)aoty.a);
            }
            case 3: {
                return new aoty();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoty.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
