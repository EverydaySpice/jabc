grammar AbcNotation;
import StandardRules;

tune: header score NEWLINE;

score:(takt)+;

takt: (note)+ TAKTSTRICH;

identifier:     'X:' INT NEWLINE;
title:          'T:' ID NEWLINE;
measure:        'M:' (ID | NOTE |FRACTION) NEWLINE;
length:         'L:' FRACTION NEWLINE;
key:            'K:' (ID | NOTE) NEWLINE;

header: identifier title optionalHeaderInfo? optionalHeaderInfo? key;

optionalHeaderInfo: measure
                    | length;

note: noteString=NOTE annotation*;

annotation: delimiter #shortenNoteLength
            | MULTIPLIER #multiplier
            | OCTAVE_DOWN #octaveDown
            | OCTAVE_UP #octaveUp;

delimiter: '/' factor=INT;
MULTIPLIER: INT;
OCTAVE_UP: '\'';
OCTAVE_DOWN: ',';

TAKTSTRICH: '|' | '|]';
NOTE: [a-gA-G];





