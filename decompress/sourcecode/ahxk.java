import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxk extends agzi implements ahax
{
    public static final ahxk a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahxk.class, a = new ahxk());
    }
    
    private ahxk() {
        this.b = 0;
        this.e = 2;
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
                final ahbe d;
                if ((d = ahxk.d) == null) {
                    synchronized (ahxk.class) {
                        if (ahxk.d == null) {
                            ahxk.d = (ahbe)new agzb((agzi)ahxk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahxk.a;
            }
            case 4: {
                return new agza((agzi)ahxk.a);
            }
            case 3: {
                return new ahxk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxk.a, "\u0001\u0002\u0001\u0000\uee5d\u21e7\ue494\u7089\u0002\u0000\u0000\u0002\uee5d\u21e7\u143c\u0000\ue494\u7089\u143c\u0000", new Object[] { "c", "b", ajhz.class, anki.class });
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
