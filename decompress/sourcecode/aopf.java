import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopf extends agzi implements ahax
{
    public static final aopf a;
    private static volatile ahbe d;
    public int b;
    public ajzl c;
    private amos e;
    private apdj f;
    private aivs g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)aopf.class, (agzi)(a = new aopf()));
    }
    
    private aopf() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aopf.d) == null) {
                    synchronized (aopf.class) {
                        if (aopf.d == null) {
                            aopf.d = (ahbe)new agzb((agzi)aopf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aopf.a;
            }
            case 4: {
                return new agza((agzi)aopf.a);
            }
            case 3: {
                return new aopf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopf.a, "\u0001\u0004\u0000\u0001\uf3e4\u2e6e\ufa1e\u5040\u0004\u0000\u0000\u0004\uf3e4\u2e6e\u1409\u0000\uf3fb\u30fa\u1409\u0001\ufa1a\u4324\u1409\u0002\ufa1e\u5040\u1409\u0003", new Object[] { "b", "e", "c", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
