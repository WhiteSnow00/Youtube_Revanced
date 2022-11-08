import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvg extends agzi implements ahax
{
    public static final amvg a;
    private static volatile ahbe d;
    public agzy b;
    public agzy c;
    
    static {
        agzi.registerDefaultInstance(amvg.class, a = new amvg());
    }
    
    private amvg() {
        this.b = agzi.emptyProtobufList();
        this.c = agzi.emptyProtobufList();
        emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = amvg.d) == null) {
                    synchronized (amvg.class) {
                        if (amvg.d == null) {
                            amvg.d = (ahbe)new agzb((agzi)amvg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amvg.a;
            }
            case 4: {
                return new agza((agzi)amvg.a);
            }
            case 3: {
                return new amvg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvg.a, "\u0001\u0002\u0000\u0000\t\f\u0002\u0000\u0002\u0000\t\u001a\f\u001a", new Object[] { "c", "b" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
