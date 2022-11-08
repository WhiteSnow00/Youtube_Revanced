import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnz extends agzd implements agze
{
    public static final ajnz a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance((Class)ajnz.class, (agzi)(a = new ajnz()));
    }
    
    private ajnz() {
        this.c = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ajnz.b) == null) {
                    synchronized (ajnz.class) {
                        if (ajnz.b == null) {
                            ajnz.b = (ahbe)new agzb((agzi)ajnz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajnz.a;
            }
            case 4: {
                return new agzc(ajnz.a);
            }
            case 3: {
                return new ajnz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajnz.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                this.c = (byte)((o != null) ? 1 : 0);
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}
