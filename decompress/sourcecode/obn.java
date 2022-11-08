import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obn extends agzi implements ahax
{
    public static final obn a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public Object d;
    public boolean e;
    
    static {
        agzi.registerDefaultInstance((Class)obn.class, (agzi)(a = new obn()));
    }
    
    private obn() {
        this.c = 0;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = obn.f) == null) {
                    synchronized (obn.class) {
                        if (obn.f == null) {
                            obn.f = (ahbe)new agzb((agzi)obn.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return obn.a;
            }
            case 4: {
                return new agza((agzi)obn.a);
            }
            case 3: {
                return new obn();
            }
            case 2: {
                return newMessageInfo((MessageLite)obn.a, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\u1007\u0000", new Object[] { "d", "c", "b", obl.class, obm.class, "e" });
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
