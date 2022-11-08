import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnm extends agzi implements ahax
{
    public static final ajnm a;
    private static volatile ahbe c;
    public agzy b;
    private byte d;
    
    static {
        agzi.registerDefaultInstance((Class)ajnm.class, (agzi)(a = new ajnm()));
    }
    
    private ajnm() {
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
                if ((c = ajnm.c) == null) {
                    synchronized (ajnm.class) {
                        if (ajnm.c == null) {
                            ajnm.c = (ahbe)new agzb((agzi)ajnm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajnm.a;
            }
            case 4: {
                return new agza((agzi)ajnm.a);
            }
            case 3: {
                return new ajnm();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajnm.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", anss.class });
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
