import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajme extends agzi implements ahax
{
    public static final ajme a;
    private static volatile ahbe c;
    public agzy b;
    private byte d;
    
    static {
        agzi.registerDefaultInstance((Class)ajme.class, (agzi)(a = new ajme()));
    }
    
    private ajme() {
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
                if ((c = ajme.c) == null) {
                    synchronized (ajme.class) {
                        if (ajme.c == null) {
                            ajme.c = (ahbe)new agzb((agzi)ajme.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajme.a;
            }
            case 4: {
                return new agza((agzi)ajme.a);
            }
            case 3: {
                return new ajme();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajme.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", aorm.class });
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