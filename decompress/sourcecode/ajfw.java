import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfw extends agzi implements ahax
{
    public static final ajfw a;
    private static volatile ahbe f;
    public int b;
    public agzy c;
    public agzy d;
    public int e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ajfw.class, a = new ajfw());
    }
    
    private ajfw() {
        this.g = 2;
        this.c = agzi.emptyProtobufList();
        this.d = agzi.emptyProtobufList();
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
                final ahbe f;
                if ((f = ajfw.f) == null) {
                    synchronized (ajfw.class) {
                        if (ajfw.f == null) {
                            ajfw.f = (ahbe)new agzb((agzi)ajfw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajfw.a;
            }
            case 4: {
                return new agza((short[][][])null, (short[][][])null);
            }
            case 3: {
                return new ajfw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajfw.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001\u041b\u0002\u041b\u0003\u100c\u0000", new Object[] { "b", "c", aorm.class, "d", aorm.class, "e", apwq.a() });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
