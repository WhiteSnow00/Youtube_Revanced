import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aome extends agzi implements ahax
{
    public static final aome a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public String d;
    
    static {
        agzi.registerDefaultInstance((Class)aome.class, (agzi)(a = new aome()));
    }
    
    private aome() {
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aome.e) == null) {
                    synchronized (aome.class) {
                        if (aome.e == null) {
                            aome.e = (ahbe)new agzb((agzi)aome.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aome.a;
            }
            case 4: {
                return new agza((agzi)aome.a);
            }
            case 3: {
                return new aome();
            }
            case 2: {
                return newMessageInfo((MessageLite)aome.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
