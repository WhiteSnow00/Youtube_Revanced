import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqit extends ahcu implements ahcv
{
    public static final aqit a;
    public static final ahcx b;
    private static volatile ahev c;
    private byte d;
    
    static {
        final aqit a2 = new aqit();
        ahcz.registerDefaultInstance(aqit.class, (ahcz)(a = a2));
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 342268478, ahgc.k, aqit.class);
    }
    
    private aqit() {
        this.d = 2;
    }
    
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aqit.c) == null) {
                    synchronized (aqit.class) {
                        if (aqit.c == null) {
                            aqit.c = (ahev)new ahcs((ahcz)aqit.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqit.a;
            }
            case 4: {
                return new ahct((ahcu)aqit.a);
            }
            case 3: {
                return new aqit();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqit.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                byte d;
                if (o == null) {
                    d = 0;
                }
                else {
                    d = 1;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
