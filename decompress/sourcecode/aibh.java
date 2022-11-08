import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibh extends agzi implements ahax
{
    public static final aibh a;
    private static volatile ahbe b;
    private int c;
    private aibe d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aibh.class, (agzi)(a = new aibh()));
    }
    
    private aibh() {
        this.e = 2;
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
                final ahbe b2;
                if ((b2 = aibh.b) == null) {
                    synchronized (aibh.class) {
                        if (aibh.b == null) {
                            aibh.b = (ahbe)new agzb((agzi)aibh.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aibh.a;
            }
            case 4: {
                return new agza((agzi)aibh.a);
            }
            case 3: {
                return new aibh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibh.a, "\u0001\u0001\u0000\u0001\uee86\u3c89\uee86\u3c89\u0001\u0000\u0000\u0001\uee86\u3c89\u1409\u0000", new Object[] { "c", "d" });
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
