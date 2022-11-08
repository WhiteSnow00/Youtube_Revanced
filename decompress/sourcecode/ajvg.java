import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvg extends agzi implements ahax
{
    public static final ajvg a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(ajvg.class, a = new ajvg());
    }
    
    private ajvg() {
        this.c = "";
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
                if ((d = ajvg.d) == null) {
                    synchronized (ajvg.class) {
                        if (ajvg.d == null) {
                            ajvg.d = (ahbe)new agzb((agzi)ajvg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajvg.a;
            }
            case 4: {
                return new agza((agzi)ajvg.a);
            }
            case 3: {
                return new ajvg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
