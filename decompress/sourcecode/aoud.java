import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoud extends agzi implements ahax
{
    public static final aoud a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    
    static {
        agzi.registerDefaultInstance(aoud.class, a = new aoud());
    }
    
    private aoud() {
        this.c = "";
        this.d = true;
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
                if ((h = aoud.h) == null) {
                    synchronized (aoud.class) {
                        if (aoud.h == null) {
                            aoud.h = (ahbe)new agzb((agzi)aoud.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aoud.a;
            }
            case 4: {
                return new agza((agzi)aoud.a);
            }
            case 3: {
                return new aoud();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoud.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1004\u0002\u0004\u1007\u0003\u0005\u100c\u0004", new Object[] { "b", "c", "d", "e", "f", "g", aotw.a() });
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
