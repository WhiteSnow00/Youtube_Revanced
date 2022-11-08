import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aonh extends agzi implements ahax
{
    public static final aonh a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aonh.class, (agzi)(a = new aonh()));
    }
    
    private aonh() {
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
                if ((d = aonh.d) == null) {
                    synchronized (aonh.class) {
                        if (aonh.d == null) {
                            aonh.d = (ahbe)new agzb((agzi)aonh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aonh.a;
            }
            case 4: {
                return new agza((agzi)aonh.a);
            }
            case 3: {
                return new aonh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aonh.a, "\u0001\u0002\u0001\u0000\ue5c8\u2847\uee90\u3e84\u0002\u0000\u0000\u0002\ue5c8\u2847\u143c\u0000\uee90\u3e84\u143c\u0000", new Object[] { "c", "b", aonf.class, aona.class });
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
