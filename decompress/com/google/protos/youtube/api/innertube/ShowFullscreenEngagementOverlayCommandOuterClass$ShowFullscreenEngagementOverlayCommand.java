// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand extends ahbh implements ahcw
{
    public static final ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand a;
    private static volatile ahdd b;
    public static final ahbf showFullscreenEngagementOverlayCommand;
    
    static {
        final ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand a2 = new ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand();
        ahbh.registerDefaultInstance((Class)ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.class, (ahbh)(a = a2));
        showFullscreenEngagementOverlayCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 392585764, ahek.k, (Class)ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.class);
    }
    
    private ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.b) == null) {
                    synchronized (ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.class) {
                        if (ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.b == null) {
                            ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.b = (ahdd)new ahba((ahbh)ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.a);
            }
            case 3: {
                return new ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.a, "\u0001\u0000", (Object[])null);
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
