import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibm extends agzi implements ahax
{
    public static final aibm a;
    private static volatile ahbe c;
    public aibb b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aibm.class, (agzi)(a = new aibm()));
    }
    
    private aibm() {
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
                final ahbe c;
                if ((c = aibm.c) == null) {
                    synchronized (aibm.class) {
                        if (aibm.c == null) {
                            aibm.c = (ahbe)new agzb((agzi)aibm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aibm.a;
            }
            case 4: {
                return new agza((agzi)aibm.a);
            }
            case 3: {
                return new aibm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibm.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "d", "b" });
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