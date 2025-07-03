package sealed;

/**
 * Only classes defined in the same file as the sealed interface or in the permits section are allowed to implement it.
 * Classes must be in the same package or, if using modules, in the same module.
 */
sealed interface TrafficLight permits RedLight, GreenLight, YellowLight, FlashingLight {}

final class RedLight implements TrafficLight {}
final class GreenLight implements TrafficLight {}
final class YellowLight implements TrafficLight {}
