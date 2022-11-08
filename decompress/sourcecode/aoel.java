import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoel extends agzi implements ahax
{
    public static final aoel a;
    private static volatile ahbe d;
    public int b;
    public amdk c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aoel.class, a = new aoel());
    }
    
    private aoel() {
        this.e = 2;
    }
    
    @Override
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
                if ((d = aoel.d) == null) {
                    synchronized (aoel.class) {
                        if (aoel.d == null) {
                            aoel.d = (ahbe)new agzb((agzi)aoel.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoel.a;
            }
            case 4: {
                return new agza((agzi)aoel.a);
            }
            case 3: {
                return new aoel();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoel.a, "\u0001\u0001\u0000\u0001\uefcf\u2e35\uefcf\u2e35\u0001\u0000\u0000\u0001\uefcf\u2e35\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
