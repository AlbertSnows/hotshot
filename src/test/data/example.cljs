(ns data.example)

(def test-data "{'body': [
{
        'made_shots': ['red2', 'green1', 'blue1', 'red2', 'red1'],
        'attempted_shots': [ 'red2', 'green1', 'blue1', 'red2' ,'red1', 'green1']
    }]}")

(def example-hotshot-request
  "{'body':
   [{
        'made_shots': ['green1', 'gray2', 'red2'],
        'attempted_shots': ['green1', 'gray2', 'blue2', 'red2']
    }, {
        'made_shots': ['green1', 'yellow1', 'gray2', 'blue1'],
        'attempted_shots': ['green1', 'yellow1', 'gray2', 'blue1', 'red2']
    }, {
        'made_shots': ['green1', 'yellow1', 'blue2', 'red1', 'blue2', 'gray2', 'gray1', 'red2', 'blue1'],
        'attempted_shots':  ['green1', 'yellow1', 'blue2', 'red1', 'blue2', 'gray2', 'gray1', 'red2', 'blue1'],
        'goat_shots': ['green1', 'yellow1', 'gray2']
    }, {
        'made_shots': ['green1', 'yellow1', 'blue2', 'red2'],
        'attempted_shots': ['green1', 'yellow1', 'blue2', 'red2']
    }, {
        'made_shots': ['green1', 'yellow1'],
        'attempted_shots': ['green1', 'yellow1', 'gray2', 'blue2', 'red2']
    }, {
        'made_shots': ['red2', 'green1', 'blue1', 'red2', 'red1'],
        'attempted_shots': [ 'red2', 'green1', 'blue1', 'red2' ,'red1', 'green1']
    }, {
        'made_shots': ['green1', 'yellow1', 'gray2', 'blue1', 'red1'],
        'attempted_shots': ['green1', 'yellow1', 'gray2', 'blue1', 'red1']
    }, {
        'made_shots': ['green1', 'yellow1', 'gray2'],
        'attempted_shots': ['green1', 'yellow1', 'gray2', 'blue1', 'red2']
    }, {
        'made_shots': ['green1', 'yellow1', 'gray2', 'blue2'],
        'attempted_shots': ['green1', 'yellow1', 'gray2', 'blue2']
    }, {
        'made_shots': ['green1', 'yellow1', 'gray1', 'blue2', 'red2'],
        'attempted_shots': ['green1', 'yellow1', 'gray1', 'blue2', 'red2']}]}")
