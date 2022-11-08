import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aocz extends agzi implements ahax
{
    public static final aocz a;
    private static volatile ahbe d;
    public int b;
    public apjz c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aocz.class, a = new aocz());
    }
    
    private aocz() {
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
                if ((d = aocz.d) == null) {
                    synchronized (aocz.class) {
                        if (aocz.d == null) {
                            aocz.d = (ahbe)new agzb((agzi)aocz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aocz.a;
            }
            case 4: {
                return new agza((agzi)aocz.a);
            }
            case 3: {
                return new aocz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aocz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
