import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitk extends agzi implements ahax
{
    public static final aitk a;
    private static volatile ahbe c;
    public agzy b;
    private byte d;
    
    static {
        agzi.registerDefaultInstance(aitk.class, a = new aitk());
    }
    
    private aitk() {
        this.d = 2;
        this.b = agzi.emptyProtobufList();
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
                final ahbe c;
                if ((c = aitk.c) == null) {
                    synchronized (aitk.class) {
                        if (aitk.c == null) {
                            aitk.c = (ahbe)new agzb((agzi)aitk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aitk.a;
            }
            case 4: {
                return new agza((agzi)aitk.a);
            }
            case 3: {
                return new aitk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aitk.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", aitj.class });
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
