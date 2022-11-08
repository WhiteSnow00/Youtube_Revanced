import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjh extends agzi implements ahax
{
    public static final ahjh a;
    private static volatile ahbe c;
    public agzy b;
    private byte d;
    
    static {
        agzi.registerDefaultInstance((Class)ahjh.class, (agzi)(a = new ahjh()));
    }
    
    private ahjh() {
        this.d = 2;
        this.b = emptyProtobufList();
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
                if ((c = ahjh.c) == null) {
                    synchronized (ahjh.class) {
                        if (ahjh.c == null) {
                            ahjh.c = (ahbe)new agzb((agzi)ahjh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahjh.a;
            }
            case 4: {
                return new agza((agzi)ahjh.a);
            }
            case 3: {
                return new ahjh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjh.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", ajnh.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.d = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
