import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiat extends agzi implements ahax
{
    public static final aiat a;
    private static volatile ahbe d;
    public int b;
    public ansi c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aiat.class, (agzi)(a = new aiat()));
    }
    
    private aiat() {
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
                if ((d = aiat.d) == null) {
                    synchronized (aiat.class) {
                        if (aiat.d == null) {
                            aiat.d = (ahbe)new agzb((agzi)aiat.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiat.a;
            }
            case 4: {
                return new agza((agzi)aiat.a);
            }
            case 3: {
                return new aiat();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiat.a, "\u0001\u0001\u0000\u0001\uf697\u1cd7\uf697\u1cd7\u0001\u0000\u0000\u0001\uf697\u1cd7\u1409\u0000", new Object[] { "b", "c" });
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
