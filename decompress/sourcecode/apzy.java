import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzy extends agzi implements ahax
{
    public static final apzy a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public akve d;
    public int e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(apzy.class, a = new apzy());
    }
    
    private apzy() {
        this.g = 2;
        this.c = "";
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
                if ((f = apzy.f) == null) {
                    synchronized (apzy.class) {
                        if (apzy.f == null) {
                            apzy.f = (ahbe)new agzb((agzi)apzy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apzy.a;
            }
            case 4: {
                return new agza((agzi)apzy.a);
            }
            case 3: {
                return new apzy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", "e", aqah.b });
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
