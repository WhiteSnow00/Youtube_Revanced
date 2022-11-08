import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibr extends agzi implements ahax
{
    public static final aibr a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aibr.class, (agzi)(a = new aibr()));
    }
    
    private aibr() {
        this.b = 0;
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
                final ahbe d;
                if ((d = aibr.d) == null) {
                    synchronized (aibr.class) {
                        if (aibr.d == null) {
                            aibr.d = (ahbe)new agzb((agzi)aibr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aibr.a;
            }
            case 4: {
                return new agza((agzi)aibr.a);
            }
            case 3: {
                return new aibr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibr.a, "\u0001\u0001\u0001\u0000\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u143c\u0000", new Object[] { "c", "b", aibb.class });
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
